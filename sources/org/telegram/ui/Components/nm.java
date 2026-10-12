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
public final class nm extends vm {
    public final boolean f28870b;
    public final ChatAttachAlertPhotoLayout f28871c;

    public nm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f28871c = chatAttachAlertPhotoLayout;
        this.f28870b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23799q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28871c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f23801s1.size());
    }

    @Override
    public final void G() {
        mm mmVar = this.f28871c.E;
        int childCount = mmVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mmVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f22812a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28871c;
        if (!chatAttachAlertPhotoLayout.f30570b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f28870b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f23799q1;
        this.f28871c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f28871c.f30570b.V1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23799q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28871c;
        TextView textView = chatAttachAlertPhotoLayout.f23833p0;
        chatAttachAlertPhotoLayout.f23840t0 = false;
        if (ChatAttachAlertPhotoLayout.f23799q1) {
            aj ajVar = chatAttachAlertPhotoLayout.f30570b;
            ajVar.f24329c2.I1(0, true, true, 0, 0, 0L, ajVar.u1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f23806b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f23836r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        aj ajVar = this.f28871c.f30570b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f23800r1;
        if (!arrayList.isEmpty() && !ajVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
            if (!(m2Var instanceof org.telegram.ui.eo) || !((org.telegram.ui.eo) m2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f23800r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            ajVar.a1();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f33885u2 = false;
            g5.Z(ajVar.M1, ajVar.l1() + ChatAttachAlertPhotoLayout.f23801s1.size(), ajVar.p1(), new im(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28871c;
        if (chatAttachAlertPhotoLayout.f23806b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new tg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f23826l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f23840t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f23800r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f23800r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f23800r1.clear();
                ChatAttachAlertPhotoLayout.f23802t1.clear();
                ChatAttachAlertPhotoLayout.f23801s1.clear();
                chatAttachAlertPhotoLayout.f23833p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f23836r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f30570b.Z1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        aj ajVar = this.f28871c.f30570b;
        if (!ajVar.F && !ajVar.H) {
            return true;
        }
        return false;
    }
}
