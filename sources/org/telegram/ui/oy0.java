package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements View.OnClickListener {
    public final int f50670a;
    public final Object f50671b;

    public oy0(Object obj, int i7) {
        this.f50670a = i7;
        this.f50671b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.r1[] cells;
        org.telegram.ui.Cells.d2 d2Var;
        float f10;
        switch (this.f50670a) {
            case 0:
                my0 my0Var = (my0) ((di.n4) this.f50671b).f9394e;
                if (my0Var != null) {
                    my0Var.run();
                    return;
                }
                return;
            case 1:
                ((uy0) this.f50671b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f50671b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43745a);
                    org.telegram.messenger.kv kvVar = saveToGallerySettingsActivity.f43747c;
                    m10.put(kvVar.d, kvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43745a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.a30) this.f50671b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50671b;
                org.telegram.messenger.fj fjVar = secretMediaViewer.f43772g0;
                if (fjVar != null) {
                    TLRPC.Message message = fjVar.f23993k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.l3 l3Var = secretMediaViewer.f43792r;
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
                c21 c21Var = (c21) this.f50671b;
                if (c21Var.W1 instanceof TLRPC.User) {
                    hi.e eVar = c21Var.d2;
                    if (!eVar.R) {
                        eVar.setLoading(true);
                        c21Var.f1((TLRPC.User) c21Var.W1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((b31) this.f50671b).f45766f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    t9.j0(sessionsActivity.getParentActivity(), 2, new z21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                h61 h61Var = (h61) this.f50671b;
                org.telegram.messenger.bz.H0 = !org.telegram.messenger.bz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.bz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.m6.k(false, false);
                h61Var.f48246c.setChecked(org.telegram.messenger.bz.H0);
                org.telegram.ui.Cells.ba baVar = h61Var.f48244a;
                for (org.telegram.ui.Cells.r1 r1Var : baVar.getCells()) {
                    r1Var.getMessageObject().S1 = false;
                    r1Var.H1();
                    r1Var.requestLayout();
                }
                baVar.invalidate();
                org.telegram.messenger.ks.e().k(279, new Object[0]);
                return;
            case 8:
                ((i81) this.f50671b).c(true);
                return;
            case 9:
                ((i81) ((di.i4) this.f50671b).f9035c).c(true);
                return;
            case 10:
                p81 p81Var = (p81) this.f50671b;
                ArrayList arrayList = p81Var.f50809f;
                HashSet hashSet = p81Var.f50814x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User c22 = p81Var.getMessagesController().c2(Long.valueOf(p81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f28431id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        p81Var.getMessagesController().X3(chat, false);
                        p81Var.getMessagesController().f0(chat.f28431id, c22);
                    }
                    p81Var.finishFragment();
                    return;
                }
                return;
            default:
                zc1 zc1Var = (zc1) this.f50671b;
                zc1Var.f54523a.c(!d2Var.b(), true);
                zc1Var.f54525c.setEnabled(zc1Var.f54523a.b());
                ViewPropertyAnimator animate = zc1Var.f54525c.animate();
                if (zc1Var.f54523a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
