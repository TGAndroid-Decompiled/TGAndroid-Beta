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
public final class lm extends tm {
    public final boolean f28485b;
    public final ChatAttachAlertPhotoLayout f28486c;

    public lm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f28486c = chatAttachAlertPhotoLayout;
        this.f28485b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24021q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28486c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f24023s1.size());
    }

    @Override
    public final void G() {
        km kmVar = this.f28486c.E;
        int childCount = kmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f23048a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28486c;
        if (!chatAttachAlertPhotoLayout.f30173b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f28485b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f24021q1;
        this.f28486c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f28486c.f30173b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f24021q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28486c;
        TextView textView = chatAttachAlertPhotoLayout.f24055p0;
        chatAttachAlertPhotoLayout.f24062t0 = false;
        if (ChatAttachAlertPhotoLayout.f24021q1) {
            yi yiVar = chatAttachAlertPhotoLayout.f30173b;
            yiVar.f33219c2.I1(0, true, true, 0, 0, 0L, yiVar.u1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f24028b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f24058r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        yi yiVar = this.f28486c.f30173b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f24022r1;
        if (!arrayList.isEmpty() && !yiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
            if (!(n2Var instanceof org.telegram.ui.zn) || !((org.telegram.ui.zn) n2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24022r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            yiVar.a1();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f34046u2 = false;
            g5.Z(yiVar.M1, yiVar.l1() + ChatAttachAlertPhotoLayout.f24023s1.size(), yiVar.p1(), new gm(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28486c;
        if (chatAttachAlertPhotoLayout.f24028b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new rg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f24048l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f24062t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f24022r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f24022r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f24022r1.clear();
                ChatAttachAlertPhotoLayout.f24024t1.clear();
                ChatAttachAlertPhotoLayout.f24023s1.clear();
                chatAttachAlertPhotoLayout.f24055p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f24058r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f30173b.Z1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        yi yiVar = this.f28486c.f30173b;
        if (!yiVar.F && !yiVar.H) {
            return true;
        }
        return false;
    }
}
