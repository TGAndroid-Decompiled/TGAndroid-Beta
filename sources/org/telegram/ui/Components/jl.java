package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;
public final class jl extends ol {
    public final boolean f34962b;
    public final ChatAttachAlertPhotoLayout f34963c;

    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        super(chatAttachAlertPhotoLayout);
        this.f34963c = chatAttachAlertPhotoLayout;
        this.f34962b = z9;
    }

    @Override
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34963c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.f31206s1.size());
    }

    @Override
    public final void G() {
        il ilVar = this.f34963c.E;
        int childCount = ilVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ilVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.f30147a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34963c;
        if (!chatAttachAlertPhotoLayout.f38656b.P1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.f34962b || i7 == 1) {
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
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
        this.f34963c.n0();
    }

    @Override
    public final boolean g() {
        if (this.f34963c.f38656b.P3 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34963c;
        TextView textView = chatAttachAlertPhotoLayout.f31237p0;
        chatAttachAlertPhotoLayout.f31244t0 = false;
        if (ChatAttachAlertPhotoLayout.f31204q1) {
            ci ciVar = chatAttachAlertPhotoLayout.f38656b;
            ciVar.W3.o1(0, true, true, 0, 0, 0L, ciVar.f1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.f31211b0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.f31240r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ci ciVar = this.f34963c.f38656b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.f31205r1;
        if (!arrayList.isEmpty() && !ciVar.P1) {
            if (j20Var != null && i7 >= 0 && i7 < arrayList.size()) {
                ((org.telegram.messenger.gf) arrayList.get(i7)).f26864s = j20Var;
            }
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            if (!(f2Var instanceof org.telegram.ui.cn) || !((org.telegram.ui.cn) f2Var).z()) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ChatAttachAlertPhotoLayout.f31205r1.get(i12);
                    if (gfVar.f26868x <= 0) {
                        org.telegram.messenger.g0.e(gfVar.I);
                    }
                }
            }
            ciVar.M0();
            PhotoViewer.p1();
            PhotoViewer.p1().O = false;
            PhotoViewer.p1().f41523u2 = false;
            u4.X(ciVar.G3, ciVar.X0() + ChatAttachAlertPhotoLayout.f31206s1.size(), ciVar.b1(), new el(this, z10, z9, i10));
        }
    }

    @Override
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f34963c;
        if (chatAttachAlertPhotoLayout.f31211b0 && chatAttachAlertPhotoLayout.P != null) {
            org.telegram.messenger.g0.i3(new wf(this, 25), 1000L);
            chatAttachAlertPhotoLayout.f31231l0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.f31244t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.f31205r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ChatAttachAlertPhotoLayout.f31205r1.get(i7);
                    new File(gfVar.I).delete();
                    if (gfVar.h != null) {
                        new File(gfVar.h).delete();
                    }
                    if (gfVar.f26850c != null) {
                        new File(gfVar.f26850c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.f31205r1.clear();
                ChatAttachAlertPhotoLayout.f31207t1.clear();
                ChatAttachAlertPhotoLayout.f31206s1.clear();
                chatAttachAlertPhotoLayout.f31237p0.setVisibility(4);
                chatAttachAlertPhotoLayout.f31240r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.f31247w.f();
                chatAttachAlertPhotoLayout.f38656b.K1(0);
            }
        }
        return true;
    }

    @Override
    public final boolean z() {
        ci ciVar = this.f34963c.f38656b;
        if (!ciVar.f32675z1 && !ciVar.B1) {
            return true;
        }
        return false;
    }
}
