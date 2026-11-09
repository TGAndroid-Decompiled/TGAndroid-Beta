package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class py0 implements View.OnClickListener {
    public final int f48832a;
    public final Object f48833b;

    public py0(Object obj, int i7) {
        this.f48832a = i7;
        this.f48833b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f10;
        switch (this.f48832a) {
            case 0:
                ny0 ny0Var = (ny0) ((bi.m5) this.f48833b).f4328e;
                if (ny0Var != null) {
                    ny0Var.run();
                    return;
                }
                return;
            case 1:
                ((vy0) this.f48833b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f48833b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41894a);
                    org.telegram.messenger.qv qvVar = saveToGallerySettingsActivity.f41896c;
                    m10.put(qvVar.d, qvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41894a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.n20) this.f48833b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f48833b;
                org.telegram.messenger.ij ijVar = secretMediaViewer.f41919f0;
                if (ijVar != null) {
                    TLRPC.Message message = ijVar.f23262k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.m3 m3Var = secretMediaViewer.f41941r;
                        if (m3Var.V) {
                            m3Var.f(true);
                            return;
                        } else {
                            secretMediaViewer.m();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                c21 c21Var = (c21) this.f48833b;
                if (c21Var.S1 instanceof TLRPC.User) {
                    fi.d dVar = c21Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        c21Var.e1((TLRPC.User) c21Var.S1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((b31) this.f48833b).f43873f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    s9.j0(sessionsActivity.getParentActivity(), 2, new z21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                h61 h61Var = (h61) this.f48833b;
                org.telegram.messenger.iz.H0 = !org.telegram.messenger.iz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.iz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.l6.k(false, false);
                h61Var.f46176c.setChecked(org.telegram.messenger.iz.H0);
                org.telegram.ui.Cells.z9 z9Var = h61Var.f46174a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.G1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.qs.e().k(276, new Object[0]);
                return;
            case 8:
                ((h81) this.f48833b).c(true);
                return;
            case 9:
                ((h81) ((bi.g5) this.f48833b).f3941c).c(true);
                return;
            case 10:
                o81 o81Var = (o81) this.f48833b;
                ArrayList arrayList = o81Var.f48403f;
                HashSet hashSet = o81Var.f48408x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = o81Var.getMessagesController().a2(Long.valueOf(o81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f26956id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        o81Var.getMessagesController().Q3(chat, false);
                        o81Var.getMessagesController().f0(chat.f26956id, a22);
                    }
                    o81Var.finishFragment();
                    return;
                }
                return;
            default:
                zc1 zc1Var = (zc1) this.f48833b;
                zc1Var.f52499a.c(!c2Var.b(), true);
                zc1Var.f52501c.setEnabled(zc1Var.f52499a.b());
                ViewPropertyAnimator animate = zc1Var.f52501c.animate();
                if (zc1Var.f52499a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
