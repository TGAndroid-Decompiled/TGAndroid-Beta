package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class b0 implements View.OnLongClickListener {
    public final int f24483a;
    public final Object f24484b;
    public final Object f24485c;

    public b0(int i10, Object obj, Object obj2) {
        this.f24483a = i10;
        this.f24484b = obj;
        this.f24485c = obj2;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i10 = this.f24483a;
        Object obj = this.f24485c;
        Object obj2 = this.f24484b;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj;
                i iVar = ((f0) obj2).f25904n;
                if (iVar == null) {
                    return false;
                }
                return ((Boolean) iVar.a(e0Var)).booleanValue();
            case 1:
                w7 w7Var = (w7) obj2;
                float f7 = MediaController.B().f14472q0;
                org.telegram.ui.ActionBar.x0 x0Var = w7Var.N1;
                x0Var.e(false, f7);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, x0Var, (org.telegram.ui.ActionBar.p6) obj);
                w7Var.a1(false);
                org.telegram.ui.ActionBar.t0 t0Var = w7Var.L1;
                t0Var.setDimMenu(0.15f);
                t0Var.U(x0Var, null);
                org.telegram.messenger.vp.e1().edit().putInt("speedhint", -15).apply();
                return true;
            case 2:
                z60 z60Var = (z60) obj2;
                ((org.telegram.ui.xs) obj).run();
                if (z60Var.J) {
                    z60Var.u();
                }
                return true;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                th.b bVar = (th.b) obj;
                org.telegram.messenger.jj jjVar = photoViewer.T4;
                if (jjVar == null) {
                    return false;
                }
                if (org.telegram.messenger.i0.g(jjVar.R0)) {
                    new cc(ra.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 4:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.R6;
                org.telegram.ui.ActionBar.k1 b10 = y8.b(profileActivity, imageView, profileActivity.a(), profileActivity.f33811f1, profileActivity.f33950z0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        int i11 = r2;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i11) {
                            case 0:
                                RectF rectF2 = ProfileActivity.R6;
                                profileActivity2.W3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.R6;
                                profileActivity2.W3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity.f33928w0 = imageView;
                profileActivity.W3(0.3f);
                UndoView undoView = profileActivity.L;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                return true;
            case 5:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.ui.ActionBar.k1 b11 = y8.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f33811f1, profileActivity2.f33950z0);
                if (b11 == null) {
                    return false;
                }
                b11.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        int i11 = r2;
                        ProfileActivity profileActivity22 = profileActivity2;
                        switch (i11) {
                            case 0:
                                RectF rectF22 = ProfileActivity.R6;
                                profileActivity22.W3(0.0f);
                                return;
                            default:
                                RectF rectF3 = ProfileActivity.R6;
                                profileActivity22.W3(0.0f);
                                return;
                        }
                    }
                });
                profileActivity2.f33928w0 = view2;
                profileActivity2.W3(0.3f);
                UndoView undoView2 = profileActivity2.L;
                if (undoView2 != null) {
                    undoView2.d(1, true);
                }
                return true;
            case 6:
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) obj2;
                dg.g gVar = (dg.g) obj;
                org.telegram.ui.e61 e61Var = d61Var.d;
                yz yzVar = d61Var.f36627a;
                if (!yzVar.f32842c) {
                    return false;
                }
                e61Var.f();
                ArrayList arrayList = e61Var.f36963n;
                bg.i iVar2 = e61Var.f36961c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.d61) arrayList.get(i11)).f36627a.setChecked(false);
                    ((org.telegram.ui.d61) arrayList.get(i11)).f36628b.f5919n = false;
                    if (e61Var.f36964r.f37435c > 0 && i11 < iVar2.d.size()) {
                        ((dg.g) iVar2.d.get(i11)).f5919n = false;
                    }
                }
                yzVar.setChecked(true);
                gVar.f5919n = true;
                e61Var.f36960b.z();
                if (e61Var.f36964r.f37435c > 0) {
                    ((dg.g) iVar2.d.get(d61Var.f36629c)).f5919n = true;
                    iVar2.z();
                }
                return true;
            default:
                th.z2 z2Var = (th.z2) obj2;
                th.o7 o7Var = (th.o7) obj;
                th.i1 i1Var = z2Var.f49720i3;
                if (i1Var != null) {
                    org.telegram.messenger.i0.r(i1Var);
                    z2Var.f49720i3 = null;
                }
                org.telegram.messenger.tz.H(true);
                vh.p2 p2Var = z2Var.f49747q0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                mj0 mj0Var = z2Var.f49692a3;
                if (mj0Var == null) {
                    mj0 mj0Var2 = new mj0(2, z2Var.f49730l2, z2Var.getContext(), LaunchActivity.Q(), new org.telegram.ui.web.a0(5, z2Var.f49725k0));
                    z2Var.f49692a3 = mj0Var2;
                    mj0Var2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(22.0f));
                    z2Var.addView(z2Var.f49692a3, z2Var.getChildCount() - 1, w7.b6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    z2Var.f49692a3.setVisibility(8);
                    z2Var.f49692a3.setDelegate(new th.f2(z2Var));
                    z2Var.f49692a3.p(null, null, true);
                } else {
                    z2Var.bringChildToFront(mj0Var);
                    z2Var.f49692a3.n();
                }
                z2Var.f49692a3.setFragment(LaunchActivity.Q());
                o7Var.f49330s.dispatchTouchEvent(org.telegram.messenger.i0.R());
                z2Var.Z0(true);
                return true;
        }
    }
}
