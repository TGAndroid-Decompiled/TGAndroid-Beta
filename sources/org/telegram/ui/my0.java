package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class my0 implements View.OnClickListener {
    public final int f47920a;
    public final Object f47921b;

    public my0(Object obj, int i7) {
        this.f47920a = i7;
        this.f47921b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f10;
        switch (this.f47920a) {
            case 0:
                ky0 ky0Var = (ky0) ((bi.m5) this.f47921b).f4328e;
                if (ky0Var != null) {
                    ky0Var.run();
                    return;
                }
                return;
            case 1:
                ((sy0) this.f47921b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f47921b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41884a);
                    org.telegram.messenger.qv qvVar = saveToGallerySettingsActivity.f41886c;
                    m10.put(qvVar.d, qvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41884a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.m20) this.f47921b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47921b;
                org.telegram.messenger.ij ijVar = secretMediaViewer.f41909f0;
                if (ijVar != null) {
                    TLRPC.Message message = ijVar.f23237k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.m3 m3Var = secretMediaViewer.f41931r;
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
                a21 a21Var = (a21) this.f47921b;
                if (a21Var.S1 instanceof TLRPC.User) {
                    fi.d dVar = a21Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        a21Var.e1((TLRPC.User) a21Var.S1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((z21) this.f47921b).f52451f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    s9.j0(sessionsActivity.getParentActivity(), 2, new x21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                g61 g61Var = (g61) this.f47921b;
                org.telegram.messenger.iz.H0 = !org.telegram.messenger.iz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.iz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.k6.k(false, false);
                g61Var.f45875c.setChecked(org.telegram.messenger.iz.H0);
                org.telegram.ui.Cells.z9 z9Var = g61Var.f45873a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.G1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.qs.e().k(276, new Object[0]);
                return;
            case 8:
                ((f81) this.f47921b).c(true);
                return;
            case 9:
                ((f81) ((bi.g5) this.f47921b).f3941c).c(true);
                return;
            case 10:
                m81 m81Var = (m81) this.f47921b;
                ArrayList arrayList = m81Var.f47730f;
                HashSet hashSet = m81Var.f47735x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = m81Var.getMessagesController().a2(Long.valueOf(m81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f26952id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        m81Var.getMessagesController().Q3(chat, false);
                        m81Var.getMessagesController().f0(chat.f26952id, a22);
                    }
                    m81Var.finishFragment();
                    return;
                }
                return;
            default:
                vc1 vc1Var = (vc1) this.f47921b;
                vc1Var.f50696a.c(!c2Var.b(), true);
                vc1Var.f50698c.setEnabled(vc1Var.f50696a.b());
                ViewPropertyAnimator animate = vc1Var.f50698c.animate();
                if (vc1Var.f50696a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
