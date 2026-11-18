package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class yl extends dm {
    public final boolean f42517b;
    public final ChatAttachAlertPhotoLayout f42518c;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f42518c = chatAttachAlertPhotoLayout;
        this.f42517b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42518c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.f32764t1.size());
    }

    @Override
    public final void G() {
        xl xlVar = this.f42518c.F;
        int childCount = xlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = xlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.f31753a.getImageReceiver().O0(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42518c;
        if (!chatAttachAlertPhotoLayout.f36766b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f42517b || i7 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
        this.f42518c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f42518c.f36766b.Q3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42518c;
        TextView textView = chatAttachAlertPhotoLayout.f32797q0;
        chatAttachAlertPhotoLayout.f32804u0 = false;
        if (ChatAttachAlertPhotoLayout.f32762r1) {
            si siVar = chatAttachAlertPhotoLayout.f36766b;
            siVar.X3.y1(0, true, true, 0, 0, 0L, siVar.g1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f32771c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f32799r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        si siVar = this.f42518c.f36766b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f32763s1;
        if (!arrayList.isEmpty() && !siVar.Q1) {
            if (e20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.ef) arrayList.get(i7)).f27862s = e20Var;
            }
            org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
            if (!(h2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) h2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f32763s1.get(i12);
                    if (efVar.f27866x <= 0) {
                        org.telegram.messenger.g0.e(efVar.I);
                    }
                }
            }
            siVar.N0();
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43348v2 = false;
            b5.X(siVar.H3, siVar.Y0() + ChatAttachAlertPhotoLayout.f32764t1.size(), siVar.c1(), new tl(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42518c;
        if (chatAttachAlertPhotoLayout.f32771c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.h3(new lg(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f32804u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f32763s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f32763s1.get(i7);
                    new File(efVar.I).delete();
                    if (efVar.h != null) {
                        new File(efVar.h).delete();
                    }
                    if (efVar.f27848c != null) {
                        new File(efVar.f27848c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f32763s1.clear();
                ChatAttachAlertPhotoLayout.f32765u1.clear();
                ChatAttachAlertPhotoLayout.f32764t1.clear();
                chatAttachAlertPhotoLayout.f32797q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f32799r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32806w.f();
                chatAttachAlertPhotoLayout.f36766b.L1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        si siVar = this.f42518c.f36766b;
        if (!siVar.A1 && !siVar.C1) {
            return true;
        }
        return false;
    }
}
