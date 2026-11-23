package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class am extends fm {
    public final boolean f33549b;
    public final ChatAttachAlertPhotoLayout f33550c;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f33550c = chatAttachAlertPhotoLayout;
        this.f33549b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33550c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32800t1.size());
    }

    @Override
    public final void G() {
        zl zlVar = this.f33550c.F;
        int childCount = zlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f31784a.getImageReceiver().O0(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33550c;
        if (!chatAttachAlertPhotoLayout.f37520b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f33549b || i7 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
        this.f33550c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f33550c.f37520b.Q3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33550c;
        TextView textView = chatAttachAlertPhotoLayout.f32833q0;
        chatAttachAlertPhotoLayout.f32840u0 = false;
        if (ChatAttachAlertPhotoLayout.f32798r1) {
            ui uiVar = chatAttachAlertPhotoLayout.f37520b;
            uiVar.X3.y1(0, true, true, 0, 0, 0L, uiVar.g1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f32807c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f32835r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        ui uiVar = this.f33550c.f37520b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f32799s1;
        if (!arrayList.isEmpty() && !uiVar.Q1) {
            if (f20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.ff) arrayList.get(i7)).f28074s = f20Var;
            }
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
            if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f32799s1.get(i12);
                    if (ffVar.f28078x <= 0) {
                        org.telegram.messenger.g0.e(ffVar.I);
                    }
                }
            }
            uiVar.N0();
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43393v2 = false;
            c5.X(uiVar.H3, uiVar.Y0() + ChatAttachAlertPhotoLayout.f32800t1.size(), uiVar.c1(), new vl(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33550c;
        if (chatAttachAlertPhotoLayout.f32807c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.h3(new og(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f32840u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f32799s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f32799s1.get(i7);
                    new File(ffVar.I).delete();
                    if (ffVar.h != null) {
                        new File(ffVar.h).delete();
                    }
                    if (ffVar.f28060c != null) {
                        new File(ffVar.f28060c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f32799s1.clear();
                ChatAttachAlertPhotoLayout.f32801u1.clear();
                ChatAttachAlertPhotoLayout.f32800t1.clear();
                chatAttachAlertPhotoLayout.f32833q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f32835r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32842w.f();
                chatAttachAlertPhotoLayout.f37520b.L1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ui uiVar = this.f33550c.f37520b;
        if (!uiVar.A1 && !uiVar.C1) {
            return true;
        }
        return false;
    }
}
