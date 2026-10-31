package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class ql extends xl {
    public final boolean f29674b;
    public final ChatAttachAlertPhotoLayout f29675c;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f29675c = chatAttachAlertPhotoLayout;
        this.f29674b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29675c;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f23847s1.size());
    }

    @Override
    public final void G() {
        pl plVar = this.f29675c.E;
        int childCount = plVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = plVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                v5Var.f23307a.getImageReceiver().O0(true, true);
                v5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29675c;
        if (!chatAttachAlertPhotoLayout.f30947b.M1) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f29674b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
        this.f29675c.l0();
    }

    @Override
    public final boolean g() {
        if (this.f29675c.f30947b.M3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29675c;
        TextView textView = chatAttachAlertPhotoLayout.f23879p0;
        chatAttachAlertPhotoLayout.f23886t0 = false;
        if (ChatAttachAlertPhotoLayout.f23845q1) {
            bi biVar = chatAttachAlertPhotoLayout.f30947b;
            biVar.T3.H0(0, true, true, 0, 0, 0L, biVar.e1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f23852b0) {
            chatAttachAlertPhotoLayout.i0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f23882r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.z0(false);
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        bi biVar = this.f29675c.f30947b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f23846r1;
        if (!arrayList.isEmpty() && !biVar.M1) {
            if (x20Var != null && i10 >= 0 && i10 < arrayList.size()) {
                ((org.telegram.messenger.ef) arrayList.get(i10)).f19521s = x20Var;
            }
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (!(k2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) k2Var).z()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f23846r1.get(i13);
                    if (efVar.f19525x <= 0) {
                        org.telegram.messenger.i0.e(efVar.I);
                    }
                }
            }
            biVar.M0();
            PhotoViewer.v1();
            PhotoViewer.v1().O = false;
            PhotoViewer.v1().f33613u2 = false;
            s4.Z(biVar.D3, biVar.W0() + ChatAttachAlertPhotoLayout.f23847s1.size(), biVar.a1(), new kl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29675c;
        if (chatAttachAlertPhotoLayout.f23852b0 && chatAttachAlertPhotoLayout.P != null) {
            org.telegram.messenger.i0.h3(new tf(this, 26), 1000L);
            chatAttachAlertPhotoLayout.f23872l0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f23886t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f23846r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.f23846r1.get(i10);
                    new File(efVar.I).delete();
                    if (efVar.h != null) {
                        new File(efVar.h).delete();
                    }
                    if (efVar.f19508c != null) {
                        new File(efVar.f19508c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f23846r1.clear();
                ChatAttachAlertPhotoLayout.f23848t1.clear();
                ChatAttachAlertPhotoLayout.f23847s1.clear();
                chatAttachAlertPhotoLayout.f23879p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f23882r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f23889w.f();
                chatAttachAlertPhotoLayout.f30947b.J1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        bi biVar = this.f29675c.f30947b;
        if (!biVar.f24736w1 && !biVar.f24744y1) {
            return true;
        }
        return false;
    }
}
