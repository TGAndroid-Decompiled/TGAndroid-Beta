package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class ql extends xl {
    public final boolean f29749b;
    public final ChatAttachAlertPhotoLayout f29750c;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.f29750c = chatAttachAlertPhotoLayout;
        this.f29749b = z10;
    }

    @Override
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750c;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f23848s1.size());
    }

    @Override
    public final void G() {
        pl plVar = this.f29750c.E;
        int childCount = plVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = plVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                v5Var.f23308a.getImageReceiver().O0(true, true);
                v5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750c;
        if (!chatAttachAlertPhotoLayout.f30964b.M1) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f29749b || i10 == 1) {
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
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
        this.f29750c.l0();
    }

    @Override
    public final boolean g() {
        if (this.f29750c.f30964b.M3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750c;
        TextView textView = chatAttachAlertPhotoLayout.f23880p0;
        chatAttachAlertPhotoLayout.f23887t0 = false;
        if (ChatAttachAlertPhotoLayout.f23846q1) {
            bi biVar = chatAttachAlertPhotoLayout.f30964b;
            biVar.T3.H0(0, true, true, 0, 0, 0L, biVar.e1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f23853b0) {
            chatAttachAlertPhotoLayout.i0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f23883r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.z0(false);
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        bi biVar = this.f29750c.f30964b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f23847r1;
        if (!arrayList.isEmpty() && !biVar.M1) {
            if (y20Var != null && i10 >= 0 && i10 < arrayList.size()) {
                ((org.telegram.messenger.ff) arrayList.get(i10)).f14617s = y20Var;
            }
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (!(k2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) k2Var).A()) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f23847r1.get(i13);
                    if (ffVar.f14621x <= 0) {
                        org.telegram.messenger.i0.e(ffVar.I);
                    }
                }
            }
            biVar.M0();
            PhotoViewer.v1();
            PhotoViewer.v1().O = false;
            PhotoViewer.v1().f33620u2 = false;
            s4.Z(biVar.D3, biVar.W0() + ChatAttachAlertPhotoLayout.f23848s1.size(), biVar.a1(), new kl(this, z11, z10, i11));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29750c;
        if (chatAttachAlertPhotoLayout.f23853b0 && chatAttachAlertPhotoLayout.P != null) {
            org.telegram.messenger.i0.h3(new tf(this, 26), 1000L);
            chatAttachAlertPhotoLayout.f23873l0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f23887t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f23847r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.f23847r1.get(i10);
                    new File(ffVar.I).delete();
                    if (ffVar.h != null) {
                        new File(ffVar.h).delete();
                    }
                    if (ffVar.f14604c != null) {
                        new File(ffVar.f14604c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f23847r1.clear();
                ChatAttachAlertPhotoLayout.f23849t1.clear();
                ChatAttachAlertPhotoLayout.f23848s1.clear();
                chatAttachAlertPhotoLayout.f23880p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f23883r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f23890w.f();
                chatAttachAlertPhotoLayout.f30964b.J1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        bi biVar = this.f29750c.f30964b;
        if (!biVar.f24827w1 && !biVar.f24835y1) {
            return true;
        }
        return false;
    }
}
