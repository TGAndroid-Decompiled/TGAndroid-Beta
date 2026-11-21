package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class am extends fm {
    public final boolean f33536b;
    public final ChatAttachAlertPhotoLayout f33537c;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f33537c = chatAttachAlertPhotoLayout;
        this.f33536b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32795r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33537c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32797t1.size());
    }

    @Override
    public final void G() {
        zl zlVar = this.f33537c.F;
        int childCount = zlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f31781a.getImageReceiver().O0(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33537c;
        if (!chatAttachAlertPhotoLayout.f37521b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f33536b || i7 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f32795r1;
        this.f33537c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f33537c.f37521b.Q3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32795r1;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33537c;
        TextView textView = chatAttachAlertPhotoLayout.f32830q0;
        chatAttachAlertPhotoLayout.f32837u0 = false;
        if (ChatAttachAlertPhotoLayout.f32795r1) {
            ui uiVar = chatAttachAlertPhotoLayout.f37521b;
            uiVar.X3.y1(0, true, true, 0, 0, 0L, uiVar.g1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f32804c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f32832r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        ui uiVar = this.f33537c.f37521b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f32796s1;
        if (!arrayList.isEmpty() && !uiVar.Q1) {
            if (e20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.ef) arrayList.get(i7)).f27890s = e20Var;
            }
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40375a2;
            if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f32796s1.get(i12);
                    if (efVar.f27894x <= 0) {
                        org.telegram.messenger.g0.e(efVar.I);
                    }
                }
            }
            uiVar.N0();
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43389v2 = false;
            c5.X(uiVar.H3, uiVar.Y0() + ChatAttachAlertPhotoLayout.f32797t1.size(), uiVar.c1(), new vl(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33537c;
        if (chatAttachAlertPhotoLayout.f32804c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.h3(new og(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f32837u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f32796s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f32796s1.get(i7);
                    new File(efVar.I).delete();
                    if (efVar.h != null) {
                        new File(efVar.h).delete();
                    }
                    if (efVar.f27876c != null) {
                        new File(efVar.f27876c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f32796s1.clear();
                ChatAttachAlertPhotoLayout.f32798u1.clear();
                ChatAttachAlertPhotoLayout.f32797t1.clear();
                chatAttachAlertPhotoLayout.f32830q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f32832r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32839w.f();
                chatAttachAlertPhotoLayout.f37521b.L1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ui uiVar = this.f33537c.f37521b;
        if (!uiVar.A1 && !uiVar.C1) {
            return true;
        }
        return false;
    }
}
