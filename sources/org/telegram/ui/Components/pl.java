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
public final class pl extends yl {
    public final boolean f27922b;
    public final ChatAttachAlertPhotoLayout f27923c;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        super(chatAttachAlertPhotoLayout);
        this.f27923c = chatAttachAlertPhotoLayout;
        this.f27922b = z4;
    }

    @Override
    public final void D() {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27923c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.B(ChatAttachAlertPhotoLayout.f22869p1.size());
    }

    @Override
    public final void G() {
        ol olVar = this.f27923c.B;
        int childCount = olVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = olVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f22284a.getImageReceiver().setVisible(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27923c;
        if (!chatAttachAlertPhotoLayout.f24282b.S) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f27922b || i10 == 1) {
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
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
        this.f27923c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f27923c.f24282b.P1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z4 = ChatAttachAlertPhotoLayout.f22867n1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27923c;
        TextView textView = chatAttachAlertPhotoLayout.m0;
        chatAttachAlertPhotoLayout.f22900q0 = false;
        if (ChatAttachAlertPhotoLayout.f22867n1) {
            li liVar = chatAttachAlertPhotoLayout.f24282b;
            liVar.W1.G1(0, true, true, 0, 0, 0L, liVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.V) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f22901r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        li liVar = this.f27923c.f24282b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f22868o1;
        if (!arrayList.isEmpty() && !liVar.S) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
            if (!(p2Var instanceof org.telegram.ui.zn) || !((org.telegram.ui.zn) p2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22868o1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            liVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().L = false;
            PhotoViewer.t1().f31825r2 = false;
            z4.a0(liVar.G1, liVar.j1() + ChatAttachAlertPhotoLayout.f22869p1.size(), liVar.n1(), new jl(this, z10, z4, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27923c;
        if (chatAttachAlertPhotoLayout.V && chatAttachAlertPhotoLayout.M != null) {
            AndroidUtilities.runOnUIThread(new fg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f22888i0.b(0.0f, false);
            chatAttachAlertPhotoLayout.f22913y0 = 0.0f;
            chatAttachAlertPhotoLayout.M.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.M.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f22900q0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f22868o1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22868o1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f22868o1.clear();
                ChatAttachAlertPhotoLayout.f22870q1.clear();
                ChatAttachAlertPhotoLayout.f22869p1.clear();
                chatAttachAlertPhotoLayout.m0.setVisibility(4);
                chatAttachAlertPhotoLayout.f22901r.setVisibility(8);
                chatAttachAlertPhotoLayout.D.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f24282b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        li liVar = this.f27923c.f24282b;
        if (!liVar.C && !liVar.E) {
            return true;
        }
        return false;
    }
}
