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
public final class dm extends lm {
    public final boolean f25789b;
    public final ChatAttachAlertPhotoLayout f25790c;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f25790c = chatAttachAlertPhotoLayout;
        this.f25789b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25790c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f24225s1.size());
    }

    @Override
    public final void G() {
        cm cmVar = this.f25790c.E;
        int childCount = cmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f23248a.getImageReceiver().setVisible(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25790c;
        if (!chatAttachAlertPhotoLayout.f27704b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f25789b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
        this.f25790c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f25790c.f27704b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24223q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25790c;
        TextView textView = chatAttachAlertPhotoLayout.f24257p0;
        chatAttachAlertPhotoLayout.f24264t0 = false;
        if (ChatAttachAlertPhotoLayout.f24223q1) {
            ri riVar = chatAttachAlertPhotoLayout.f27704b;
            riVar.f30138c2.b0(0, true, true, 0, 0, 0L, riVar.x1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f24230b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f24260r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ri riVar = this.f25790c.f27704b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f24224r1;
        if (!arrayList.isEmpty() && !riVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
            if (!(o2Var instanceof org.telegram.ui.sn) || !((org.telegram.ui.sn) o2Var).x()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24224r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            riVar.d1();
            PhotoViewer.u1();
            PhotoViewer.u1().O = false;
            PhotoViewer.u1().f33725u2 = false;
            d5.Z(riVar.M1, riVar.o1() + ChatAttachAlertPhotoLayout.f24225s1.size(), riVar.s1(), new yl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25790c;
        if (chatAttachAlertPhotoLayout.f24230b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new ng(this, 25), 1000L);
            chatAttachAlertPhotoLayout.f24250l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f24264t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f24224r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24224r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f24224r1.clear();
                ChatAttachAlertPhotoLayout.f24226t1.clear();
                ChatAttachAlertPhotoLayout.f24225s1.clear();
                chatAttachAlertPhotoLayout.f24257p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f24260r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f27704b.d2(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ri riVar = this.f25790c.f27704b;
        if (!riVar.F && !riVar.H) {
            return true;
        }
        return false;
    }
}
