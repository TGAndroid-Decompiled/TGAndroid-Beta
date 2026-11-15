package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ky0 implements View.OnClickListener {
    public final int f48792a;
    public final Object f48793b;

    public ky0(Object obj, int i7) {
        this.f48792a = i7;
        this.f48793b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f10;
        switch (this.f48792a) {
            case 0:
                iy0 iy0Var = (iy0) ((di.k4) this.f48793b).f8909e;
                if (iy0Var != null) {
                    iy0Var.run();
                    return;
                }
                return;
            case 1:
                ((qy0) this.f48793b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f48793b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43258a);
                    org.telegram.messenger.ov ovVar = saveToGallerySettingsActivity.f43260c;
                    m10.put(ovVar.d, ovVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43258a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.p20) this.f48793b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f48793b;
                org.telegram.messenger.gj gjVar = secretMediaViewer.f43285g0;
                if (gjVar != null) {
                    TLRPC.Message message = gjVar.f23817k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.l3 l3Var = secretMediaViewer.f43305r;
                        if (l3Var.W) {
                            l3Var.f(true);
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
                x11 x11Var = (x11) this.f48793b;
                if (x11Var.W1 instanceof TLRPC.User) {
                    hi.d dVar = x11Var.d2;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        x11Var.e1((TLRPC.User) x11Var.W1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((w21) this.f48793b).f52372f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    t9.j0(sessionsActivity.getParentActivity(), 2, new u21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                d61 d61Var = (d61) this.f48793b;
                org.telegram.messenger.gz.H0 = !org.telegram.messenger.gz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.gz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.j6.k(false, false);
                d61Var.f46317c.setChecked(org.telegram.messenger.gz.H0);
                org.telegram.ui.Cells.z9 z9Var = d61Var.f46315a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().S1 = false;
                    q1Var.H1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.ns.e().k(276, new Object[0]);
                return;
            case 8:
                ((e81) this.f48793b).c(true);
                return;
            case 9:
                ((e81) ((di.f4) this.f48793b).f8532c).c(true);
                return;
            case 10:
                l81 l81Var = (l81) this.f48793b;
                ArrayList arrayList = l81Var.f48899f;
                HashSet hashSet = l81Var.f48904x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = l81Var.getMessagesController().a2(Long.valueOf(l81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f28051id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        l81Var.getMessagesController().Q3(chat, false);
                        l81Var.getMessagesController().f0(chat.f28051id, a22);
                    }
                    l81Var.finishFragment();
                    return;
                }
                return;
            default:
                wc1 wc1Var = (wc1) this.f48793b;
                wc1Var.f52545a.c(!c2Var.b(), true);
                wc1Var.f52547c.setEnabled(wc1Var.f52545a.b());
                ViewPropertyAnimator animate = wc1Var.f52547c.animate();
                if (wc1Var.f52545a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
