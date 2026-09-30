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
public final class wl extends em {
    public final boolean f30013b;
    public final ChatAttachAlertPhotoLayout f30014c;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f30014c = chatAttachAlertPhotoLayout;
        this.f30013b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22122q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30014c;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.A(ChatAttachAlertPhotoLayout.f22124s1.size());
    }

    @Override
    public final void G() {
        vl vlVar = this.f30014c.E;
        int childCount = vlVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = vlVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                t5Var.f21200a.getImageReceiver().setVisible(true, true);
                t5Var.g(true);
            }
        }
    }

    @Override
    public final boolean J() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30014c;
        if (!chatAttachAlertPhotoLayout.f27075b.V) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f30013b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f22122q1;
        this.f30014c.k0();
    }

    @Override
    public final boolean g() {
        if (this.f30014c.f27075b.S1 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f22122q1;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30014c;
        TextView textView = chatAttachAlertPhotoLayout.f22156p0;
        chatAttachAlertPhotoLayout.f22163t0 = false;
        if (ChatAttachAlertPhotoLayout.f22122q1) {
            wi wiVar = chatAttachAlertPhotoLayout.f27075b;
            wiVar.Z1.B1(0, true, true, 0, 0, 0L, wiVar.s1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f22129b0) {
            chatAttachAlertPhotoLayout.h0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f22159r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.y0(false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wi wiVar = this.f30014c.f27075b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f22123r1;
        if (!arrayList.isEmpty() && !wiVar.V) {
            if (videoEditedInfo != null && i10 >= 0 && i10 < arrayList.size()) {
                ((MediaController.PhotoEntry) arrayList.get(i10)).editedInfo = videoEditedInfo;
            }
            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f29934f0;
            if (!(m2Var instanceof org.telegram.ui.wn) || !((org.telegram.ui.wn) m2Var).v()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22123r1.get(i13);
                    if (photoEntry.ttl <= 0) {
                        AndroidUtilities.addMediaToGallery(photoEntry.path);
                    }
                }
            }
            wiVar.Y0();
            PhotoViewer.t1();
            PhotoViewer.t1().O = false;
            PhotoViewer.t1().f31367u2 = false;
            e5.a0(wiVar.J1, wiVar.j1() + ChatAttachAlertPhotoLayout.f22124s1.size(), wiVar.n1(), new rl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30014c;
        if (chatAttachAlertPhotoLayout.f22129b0 && chatAttachAlertPhotoLayout.P != null) {
            AndroidUtilities.runOnUIThread(new pg(this, 24), 1000L);
            chatAttachAlertPhotoLayout.f22149l0.b(0.0f, false);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f22163t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f22123r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ChatAttachAlertPhotoLayout.f22123r1.get(i10);
                    new File(photoEntry.path).delete();
                    if (photoEntry.imagePath != null) {
                        new File(photoEntry.imagePath).delete();
                    }
                    if (photoEntry.thumbPath != null) {
                        new File(photoEntry.thumbPath).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f22123r1.clear();
                ChatAttachAlertPhotoLayout.f22125t1.clear();
                ChatAttachAlertPhotoLayout.f22124s1.clear();
                chatAttachAlertPhotoLayout.f22156p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f22159r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.l();
                chatAttachAlertPhotoLayout.v.l();
                chatAttachAlertPhotoLayout.f27075b.V1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        wi wiVar = this.f30014c.f27075b;
        if (!wiVar.F && !wiVar.H) {
            return true;
        }
        return false;
    }
}
