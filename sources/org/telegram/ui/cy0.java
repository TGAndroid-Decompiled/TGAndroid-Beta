package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class cy0 implements View.OnClickListener {
    public final int f44486a;
    public final Object f44487b;

    public cy0(Object obj, int i3) {
        this.f44486a = i3;
        this.f44487b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f10;
        switch (this.f44486a) {
            case 0:
                ay0 ay0Var = (ay0) ((ci.t4) this.f44487b).f6025e;
                if (ay0Var != null) {
                    ay0Var.run();
                    return;
                }
                return;
            case 1:
                ((iy0) this.f44487b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f44487b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f41915a);
                    org.telegram.messenger.iv ivVar = saveToGallerySettingsActivity.f41917c;
                    m10.put(ivVar.d, ivVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f41915a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.i20) this.f44487b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44487b;
                org.telegram.messenger.zi ziVar = secretMediaViewer.f41942g0;
                if (ziVar != null) {
                    TLRPC.Message message = ziVar.f26868k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        gi.l3 l3Var = secretMediaViewer.f41962r;
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
                q11 q11Var = (q11) this.f44487b;
                if (q11Var.T1 instanceof TLRPC.User) {
                    gi.d dVar = q11Var.f48730a2;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        q11Var.e1((TLRPC.User) q11Var.T1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((p21) this.f44487b).f48429f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    s9.j0(sessionsActivity.getParentActivity(), 2, new n21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                w51 w51Var = (w51) this.f44487b;
                org.telegram.messenger.az.H0 = !org.telegram.messenger.az.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.az.H0);
                edit.apply();
                org.telegram.ui.ActionBar.k6.k(false, false);
                w51Var.f50715c.setChecked(org.telegram.messenger.az.H0);
                org.telegram.ui.Cells.z9 z9Var = w51Var.f50713a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.G1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.hs.e().k(276, new Object[0]);
                return;
            case 8:
                ((w71) this.f44487b).c(true);
                return;
            case 9:
                ((w71) ((ci.o4) this.f44487b).f5683c).c(true);
                return;
            case 10:
                d81 d81Var = (d81) this.f44487b;
                ArrayList arrayList = d81Var.f44597f;
                HashSet hashSet = d81Var.f44602x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User a22 = d81Var.getMessagesController().a2(Long.valueOf(d81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i3)).f27001id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i3));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        d81Var.getMessagesController().Q3(chat, false);
                        d81Var.getMessagesController().f0(chat.f27001id, a22);
                    }
                    d81Var.finishFragment();
                    return;
                }
                return;
            default:
                rc1 rc1Var = (rc1) this.f44487b;
                rc1Var.f49196a.c(!c2Var.b(), true);
                rc1Var.f49198c.setEnabled(rc1Var.f49196a.b());
                ViewPropertyAnimator animate = rc1Var.f49198c.animate();
                if (rc1Var.f49196a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
