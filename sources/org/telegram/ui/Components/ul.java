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
    public final boolean f28425b;
    public final ChatAttachAlertPhotoLayout f28426c;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f28426c = chatAttachAlertPhotoLayout;
        this.f28425b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f21898q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28426c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f21900s1.size());
    }

    @Override
    public final void G() {
        tl tlVar = this.f28426c.E;
        int childCount = tlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f20949a.getImageReceiver().setVisible(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28426c;
        if (!chatAttachAlertPhotoLayout.f26462b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f28425b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f21898q1;
        this.f28426c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f28426c.f26462b.S1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f21898q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28426c;
        TextView textView = chatAttachAlertPhotoLayout.f21932p0;
        chatAttachAlertPhotoLayout.f21939t0 = false;
        if (ChatAttachAlertPhotoLayout.f21898q1) {
            vi viVar = chatAttachAlertPhotoLayout.f26462b;
            viVar.Z1.B1(0, true, true, 0, 0, 0L, viVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f21905b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f21935r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vi viVar = this.f28426c.f26462b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f21899r1;
        if (!arrayList.isEmpty() && !viVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.n2 n2Var = viVar.f28750f0;
            if (!(n2Var instanceof org.telegram.ui.bo) || !((org.telegram.ui.bo) n2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f21899r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            viVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f31078u2 = false;
            c5.a0(viVar.J1, viVar.j1() + ChatAttachAlertPhotoLayout.f21900s1.size(), viVar.n1(), new pl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28426c;
        if (chatAttachAlertPhotoLayout.f21905b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new ng(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f21925l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f21939t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f21899r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f21899r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f21899r1.clear();
                ChatAttachAlertPhotoLayout.f21901t1.clear();
                ChatAttachAlertPhotoLayout.f21900s1.clear();
                chatAttachAlertPhotoLayout.f21932p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f21935r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f26462b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        vi viVar = this.f28426c.f26462b;
        if (!viVar.F && !viVar.H) {
            return true;
        }
        return false;
    }
}
