package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class kl extends pl {
    public final boolean f35332b;
    public final ChatAttachAlertPhotoLayout f35333c;

    public kl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        super(chatAttachAlertPhotoLayout);
        this.f35333c = chatAttachAlertPhotoLayout;
        this.f35332b = z9;
    }

    @Override
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35333c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31185s1.size());
    }

    @Override
    public final void G() {
        jl jlVar = this.f35333c.E;
        int childCount = jlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = jlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.f30127a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35333c;
        if (!chatAttachAlertPhotoLayout.f38951b.M1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f35332b || i7 == 1) {
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
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
        this.f35333c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f35333c.f38951b.M3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35333c;
        TextView textView = chatAttachAlertPhotoLayout.f31216p0;
        chatAttachAlertPhotoLayout.f31223t0 = false;
        if (ChatAttachAlertPhotoLayout.f31183q1) {
            di diVar = chatAttachAlertPhotoLayout.f38951b;
            diVar.T3.o1(0, true, true, 0, 0, 0L, diVar.f1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f31190b0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f31219r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        di diVar = this.f35333c.f38951b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f31184r1;
        if (!arrayList.isEmpty() && !diVar.M1) {
            if (j20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.gf) arrayList.get(i7)).f26839s = j20Var;
            }
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (!(f2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) f2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ChatAttachAlertPhotoLayout.f31184r1.get(i12);
                    if (gfVar.f26843x <= 0) {
                        org.telegram.messenger.g0.e(gfVar.I);
                    }
                }
            }
            diVar.M0();
            PhotoViewer.p1();
            PhotoViewer.p1().O = false;
            PhotoViewer.p1().f41497u2 = false;
            v4.X(diVar.D3, diVar.X0() + ChatAttachAlertPhotoLayout.f31185s1.size(), diVar.b1(), new fl(this, z10, z9, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35333c;
        if (chatAttachAlertPhotoLayout.f31190b0 && chatAttachAlertPhotoLayout.P != null) {
            org.telegram.messenger.g0.i3(new xf(this, 25), 1000L);
            chatAttachAlertPhotoLayout.f31210l0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f31223t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f31184r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ChatAttachAlertPhotoLayout.f31184r1.get(i7);
                    new File(gfVar.I).delete();
                    if (gfVar.h != null) {
                        new File(gfVar.h).delete();
                    }
                    if (gfVar.f26825c != null) {
                        new File(gfVar.f26825c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f31184r1.clear();
                ChatAttachAlertPhotoLayout.f31186t1.clear();
                ChatAttachAlertPhotoLayout.f31185s1.clear();
                chatAttachAlertPhotoLayout.f31216p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f31219r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f31226w.f();
                chatAttachAlertPhotoLayout.f38951b.K1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        di diVar = this.f35333c.f38951b;
        if (!diVar.f32957w1 && !diVar.f32965y1) {
            return true;
        }
        return false;
    }
}
