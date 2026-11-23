package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class yl extends dm {
    public final boolean f42514b;
    public final ChatAttachAlertPhotoLayout f42515c;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f42515c = chatAttachAlertPhotoLayout;
        this.f42514b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42515c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f32864t1.size());
    }

    @Override
    public final void G() {
        xl xlVar = this.f42515c.F;
        int childCount = xlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = xlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                r5Var.f31783a.getImageReceiver().P0(true, true);
                r5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42515c;
        if (!chatAttachAlertPhotoLayout.f37135b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f42514b || i7 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
        this.f42515c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f42515c.f37135b.Q3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42515c;
        TextView textView = chatAttachAlertPhotoLayout.f32897q0;
        chatAttachAlertPhotoLayout.f32904u0 = false;
        if (ChatAttachAlertPhotoLayout.f32862r1) {
            ti tiVar = chatAttachAlertPhotoLayout.f37135b;
            tiVar.X3.y1(0, true, true, 0, 0, 0L, tiVar.g1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f32871c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f32899r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        ti tiVar = this.f42515c.f37135b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f32863s1;
        if (!arrayList.isEmpty() && !tiVar.Q1) {
            if (d20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.ef) arrayList.get(i7)).f27978s = d20Var;
            }
            org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
            if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).y()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f32863s1.get(i12);
                    if (efVar.f27982x <= 0) {
                        org.telegram.messenger.g0.e(efVar.I);
                    }
                }
            }
            tiVar.N0();
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f43474v2 = false;
            b5.X(tiVar.H3, tiVar.Y0() + ChatAttachAlertPhotoLayout.f32864t1.size(), tiVar.c1(), new tl(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42515c;
        if (chatAttachAlertPhotoLayout.f32871c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.h3(new ng(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f32904u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f32863s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f32863s1.get(i7);
                    new File(efVar.I).delete();
                    if (efVar.h != null) {
                        new File(efVar.h).delete();
                    }
                    if (efVar.f27964c != null) {
                        new File(efVar.f27964c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f32863s1.clear();
                ChatAttachAlertPhotoLayout.f32865u1.clear();
                ChatAttachAlertPhotoLayout.f32864t1.clear();
                chatAttachAlertPhotoLayout.f32897q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f32899r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32906w.f();
                chatAttachAlertPhotoLayout.f37135b.L1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ti tiVar = this.f42515c.f37135b;
        if (!tiVar.A1 && !tiVar.C1) {
            return true;
        }
        return false;
    }
}
