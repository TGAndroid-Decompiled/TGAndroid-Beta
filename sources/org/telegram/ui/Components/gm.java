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
public final class gm extends om {
    public final boolean f28598b;
    public final ChatAttachAlertPhotoLayout f28599c;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f28599c = chatAttachAlertPhotoLayout;
        this.f28598b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28599c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f26015s1.size());
    }

    @Override
    public final void G() {
        fm fmVar = this.f28599c.E;
        int childCount = fmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                x5Var.f25697a.getImageReceiver().setVisible(true, true);
                x5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28599c;
        if (!chatAttachAlertPhotoLayout.f30213b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f28598b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
        this.f28599c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f28599c.f30213b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f26013q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28599c;
        TextView textView = chatAttachAlertPhotoLayout.f26047p0;
        chatAttachAlertPhotoLayout.f26054t0 = false;
        if (ChatAttachAlertPhotoLayout.f26013q1) {
            ti tiVar = chatAttachAlertPhotoLayout.f30213b;
            tiVar.f33010c2.p0(0, true, true, 0, 0, 0L, tiVar.w1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f26020b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f26050r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ti tiVar = this.f28599c.f30213b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f26014r1;
        if (!arrayList.isEmpty() && !tiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
            if (!(r2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) r2Var).w()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26014r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            tiVar.e1();
            PhotoViewer.u1();
            PhotoViewer.u1().O = false;
            PhotoViewer.u1().f35786u2 = false;
            g5.Z(tiVar.M1, tiVar.o1() + ChatAttachAlertPhotoLayout.f26015s1.size(), tiVar.s1(), new bm(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28599c;
        if (chatAttachAlertPhotoLayout.f26020b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new pg(this, 25), 1000L);
            chatAttachAlertPhotoLayout.f26040l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f26054t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f26014r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f26014r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f26014r1.clear();
                ChatAttachAlertPhotoLayout.f26016t1.clear();
                ChatAttachAlertPhotoLayout.f26015s1.clear();
                chatAttachAlertPhotoLayout.f26047p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f26050r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f30213b.c2(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ti tiVar = this.f28599c.f30213b;
        if (!tiVar.F && !tiVar.H) {
            return true;
        }
        return false;
    }
}
