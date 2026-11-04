package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class jl extends ol {
    public final boolean f35099b;
    public final ChatAttachAlertPhotoLayout f35100c;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f35100c = chatAttachAlertPhotoLayout;
        this.f35099b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35100c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31260t1.size());
    }

    @Override
    public final void G() {
        il ilVar = this.f35100c.F;
        int childCount = ilVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = ilVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.f30204a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35100c;
        if (!chatAttachAlertPhotoLayout.f38416b.N1) {
            int i3 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f35099b || i3 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
        this.f35100c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f35100c.f38416b.N3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35100c;
        TextView textView = chatAttachAlertPhotoLayout.f31293q0;
        chatAttachAlertPhotoLayout.f31300u0 = false;
        if (ChatAttachAlertPhotoLayout.f31258r1) {
            bi biVar = chatAttachAlertPhotoLayout.f38416b;
            biVar.U3.o1(0, true, true, 0, 0, 0L, biVar.f1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f31267c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f31295r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        bi biVar = this.f35100c.f38416b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f31259s1;
        if (!arrayList.isEmpty() && !biVar.N1) {
            if (b20Var != null && i3 >= 0 && i3 < arrayList.size()) {
                ((org.telegram.messenger.ye) arrayList.get(i3)).f25325s = b20Var;
            }
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (!(d2Var instanceof org.telegram.ui.wm) || !((org.telegram.ui.wm) d2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) ChatAttachAlertPhotoLayout.f31259s1.get(i12);
                    if (yeVar.f25329x <= 0) {
                        org.telegram.messenger.g0.e(yeVar.I);
                    }
                }
            }
            biVar.M0();
            PhotoViewer.v1();
            PhotoViewer.v1().P = false;
            PhotoViewer.v1().f41560v2 = false;
            t4.Z(biVar.E3, biVar.X0() + ChatAttachAlertPhotoLayout.f31260t1.size(), biVar.b1(), new el(this, z11, z10, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35100c;
        if (chatAttachAlertPhotoLayout.f31267c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.i3(new vf(this, 25), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f31300u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f31259s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) ChatAttachAlertPhotoLayout.f31259s1.get(i3);
                    new File(yeVar.I).delete();
                    if (yeVar.h != null) {
                        new File(yeVar.h).delete();
                    }
                    if (yeVar.f25311c != null) {
                        new File(yeVar.f25311c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f31259s1.clear();
                ChatAttachAlertPhotoLayout.f31261u1.clear();
                ChatAttachAlertPhotoLayout.f31260t1.clear();
                chatAttachAlertPhotoLayout.f31293q0.setVisibility(4);
                chatAttachAlertPhotoLayout.f31295r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.f31302w.f();
                chatAttachAlertPhotoLayout.f38416b.K1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        bi biVar = this.f35100c.f38416b;
        if (!biVar.f32290x1 && !biVar.f32298z1) {
            return true;
        }
        return false;
    }
}
