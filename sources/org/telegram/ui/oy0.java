package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements View.OnClickListener {
    public final int f50637a;
    public final Object f50638b;

    public oy0(Object obj, int i7) {
        this.f50637a = i7;
        this.f50638b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.r1[] cells;
        org.telegram.ui.Cells.d2 d2Var;
        float f10;
        switch (this.f50637a) {
            case 0:
                my0 my0Var = (my0) ((di.n4) this.f50638b).f9372e;
                if (my0Var != null) {
                    my0Var.run();
                    return;
                }
                return;
            case 1:
                ((uy0) this.f50638b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f50638b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43704a);
                    org.telegram.messenger.kv kvVar = saveToGallerySettingsActivity.f43706c;
                    m10.put(kvVar.d, kvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43704a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.x20) this.f50638b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50638b;
                org.telegram.messenger.fj fjVar = secretMediaViewer.f43731g0;
                if (fjVar != null) {
                    TLRPC.Message message = fjVar.f23965k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.m3 m3Var = secretMediaViewer.f43751r;
                        if (m3Var.W) {
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
                b21 b21Var = (b21) this.f50638b;
                if (b21Var.W1 instanceof TLRPC.User) {
                    hi.d dVar = b21Var.d2;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        b21Var.f1((TLRPC.User) b21Var.W1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((a31) this.f50638b).f45447f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    t9.j0(sessionsActivity.getParentActivity(), 2, new y21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                h61 h61Var = (h61) this.f50638b;
                org.telegram.messenger.bz.H0 = !org.telegram.messenger.bz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.bz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.n6.k(false, false);
                h61Var.f48170c.setChecked(org.telegram.messenger.bz.H0);
                org.telegram.ui.Cells.ba baVar = h61Var.f48168a;
                for (org.telegram.ui.Cells.r1 r1Var : baVar.getCells()) {
                    r1Var.getMessageObject().S1 = false;
                    r1Var.H1();
                    r1Var.requestLayout();
                }
                baVar.invalidate();
                org.telegram.messenger.ks.e().k(279, new Object[0]);
                return;
            case 8:
                ((i81) this.f50638b).c(true);
                return;
            case 9:
                ((i81) ((di.i4) this.f50638b).f9008c).c(true);
                return;
            case 10:
                p81 p81Var = (p81) this.f50638b;
                ArrayList arrayList = p81Var.f50768f;
                HashSet hashSet = p81Var.f50773x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User c22 = p81Var.getMessagesController().c2(Long.valueOf(p81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f28403id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        p81Var.getMessagesController().X3(chat, false);
                        p81Var.getMessagesController().f0(chat.f28403id, c22);
                    }
                    p81Var.finishFragment();
                    return;
                }
                return;
            default:
                zc1 zc1Var = (zc1) this.f50638b;
                zc1Var.f54479a.c(!d2Var.b(), true);
                zc1Var.f54481c.setEnabled(zc1Var.f54479a.b());
                ViewPropertyAnimator animate = zc1Var.f54481c.animate();
                if (zc1Var.f54479a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
