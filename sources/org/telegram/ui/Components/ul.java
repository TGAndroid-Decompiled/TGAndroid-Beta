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
public final class ul extends cm {
    public final boolean f28797b;
    public final ChatAttachAlertPhotoLayout f28798c;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f28798c = chatAttachAlertPhotoLayout;
        this.f28797b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22135q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28798c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f22137s1.size());
    }

    @Override
    public final void G() {
        tl tlVar = this.f28798c.E;
        int childCount = tlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.u5) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) childAt;
                u5Var.f21622a.getImageReceiver().setVisible(true, true);
                u5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28798c;
        if (!chatAttachAlertPhotoLayout.f26786b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f28797b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f22135q1;
        this.f28798c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f28798c.f26786b.S1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22135q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28798c;
        TextView textView = chatAttachAlertPhotoLayout.f22169p0;
        chatAttachAlertPhotoLayout.f22176t0 = false;
        if (ChatAttachAlertPhotoLayout.f22135q1) {
            vi viVar = chatAttachAlertPhotoLayout.f26786b;
            viVar.Z1.C1(0, true, true, 0, 0, 0L, viVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f22142b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f22172r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vi viVar = this.f28798c.f26786b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f22136r1;
        if (!arrayList.isEmpty() && !viVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f29096f0;
            if (!(n2Var instanceof org.telegram.ui.zn) || !((org.telegram.ui.zn) n2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22136r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            viVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f31384u2 = false;
            d5.a0(viVar.J1, viVar.j1() + ChatAttachAlertPhotoLayout.f22137s1.size(), viVar.n1(), new pl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28798c;
        if (chatAttachAlertPhotoLayout.f22142b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new og(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f22162l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f22176t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f22136r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22136r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f22136r1.clear();
                ChatAttachAlertPhotoLayout.f22138t1.clear();
                ChatAttachAlertPhotoLayout.f22137s1.clear();
                chatAttachAlertPhotoLayout.f22169p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f22172r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f26786b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        vi viVar = this.f28798c.f26786b;
        if (!viVar.F && !viVar.H) {
            return true;
        }
        return false;
    }
}
