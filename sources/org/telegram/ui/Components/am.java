package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class am extends fm {
    public final boolean f33510b;
    public final ChatAttachAlertPhotoLayout f33511c;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f33511c = chatAttachAlertPhotoLayout;
        this.f33510b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33511c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32766t1.size());
    }

    @Override
    public final void G() {
        zl zlVar = this.f33511c.F;
        int childCount = zlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f31750a.getImageReceiver().O0(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33511c;
        if (!chatAttachAlertPhotoLayout.f37477b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f33510b || i7 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
        this.f33511c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f33511c.f37477b.Q3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32764r1;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33511c;
        TextView textView = chatAttachAlertPhotoLayout.f32799q0;
        chatAttachAlertPhotoLayout.f32806u0 = false;
        if (ChatAttachAlertPhotoLayout.f32764r1) {
            ui uiVar = chatAttachAlertPhotoLayout.f37477b;
            uiVar.X3.y1(0, true, true, 0, 0, 0L, uiVar.g1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f32773c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f32801r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        ui uiVar = this.f33511c.f37477b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f32765s1;
        if (!arrayList.isEmpty() && !uiVar.Q1) {
            if (f20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.ff) arrayList.get(i7)).f28038s = f20Var;
            }
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40352a2;
            if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f32765s1.get(i12);
                    if (ffVar.f28042x <= 0) {
                        org.telegram.messenger.g0.e(ffVar.I);
                    }
                }
            }
            uiVar.N0();
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43358v2 = false;
            c5.X(uiVar.H3, uiVar.Y0() + ChatAttachAlertPhotoLayout.f32766t1.size(), uiVar.c1(), new vl(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33511c;
        if (chatAttachAlertPhotoLayout.f32773c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.h3(new ng(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f32806u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f32765s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f32765s1.get(i7);
                    new File(ffVar.I).delete();
                    if (ffVar.h != null) {
                        new File(ffVar.h).delete();
                    }
                    if (ffVar.f28024c != null) {
                        new File(ffVar.f28024c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f32765s1.clear();
                ChatAttachAlertPhotoLayout.f32767u1.clear();
                ChatAttachAlertPhotoLayout.f32766t1.clear();
                chatAttachAlertPhotoLayout.f32799q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f32801r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32808w.f();
                chatAttachAlertPhotoLayout.f37477b.L1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ui uiVar = this.f33511c.f37477b;
        if (!uiVar.A1 && !uiVar.C1) {
            return true;
        }
        return false;
    }
}
