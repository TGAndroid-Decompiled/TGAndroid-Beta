package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class rl extends wl {
    public final boolean f38996b;
    public final ChatAttachAlertPhotoLayout f38997c;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f38997c = chatAttachAlertPhotoLayout;
        this.f38996b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38997c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f32367t1.size());
    }

    @Override
    public final void G() {
        ql qlVar = this.f38997c.F;
        int childCount = qlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = qlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.f31280a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38997c;
        if (!chatAttachAlertPhotoLayout.f33607b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f38996b || i7 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
        this.f38997c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f38997c.f33607b.Q3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38997c;
        TextView textView = chatAttachAlertPhotoLayout.f32400q0;
        chatAttachAlertPhotoLayout.f32407u0 = false;
        if (ChatAttachAlertPhotoLayout.f32365r1) {
            ki kiVar = chatAttachAlertPhotoLayout.f33607b;
            kiVar.X3.y1(0, true, true, 0, 0, 0L, kiVar.f1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f32374c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f32402r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ki kiVar = this.f38997c.f33607b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f32366s1;
        if (!arrayList.isEmpty() && !kiVar.Q1) {
            if (g20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.ff) arrayList.get(i7)).f27723s = g20Var;
            }
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
            if (!(e2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) e2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f32366s1.get(i12);
                    if (ffVar.f27727x <= 0) {
                        org.telegram.messenger.g0.e(ffVar.I);
                    }
                }
            }
            kiVar.M0();
            PhotoViewer.p1();
            PhotoViewer.p1().P = false;
            PhotoViewer.p1().f42903v2 = false;
            t4.X(kiVar.H3, kiVar.X0() + ChatAttachAlertPhotoLayout.f32367t1.size(), kiVar.b1(), new ml(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f38997c;
        if (chatAttachAlertPhotoLayout.f32374c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.i3(new dg(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f32407u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f32366s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f32366s1.get(i7);
                    new File(ffVar.I).delete();
                    if (ffVar.h != null) {
                        new File(ffVar.h).delete();
                    }
                    if (ffVar.f27709c != null) {
                        new File(ffVar.f27709c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f32366s1.clear();
                ChatAttachAlertPhotoLayout.f32368u1.clear();
                ChatAttachAlertPhotoLayout.f32367t1.clear();
                chatAttachAlertPhotoLayout.f32400q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f32402r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f32409w.f();
                chatAttachAlertPhotoLayout.f33607b.K1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ki kiVar = this.f38997c.f33607b;
        if (!kiVar.A1 && !kiVar.C1) {
            return true;
        }
        return false;
    }
}
