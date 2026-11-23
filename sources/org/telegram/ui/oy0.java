package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oy0 implements View.OnClickListener {
    public final int f50655a;
    public final Object f50656b;

    public oy0(Object obj, int i7) {
        this.f50655a = i7;
        this.f50656b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.r1[] cells;
        org.telegram.ui.Cells.d2 d2Var;
        float f10;
        switch (this.f50655a) {
            case 0:
                my0 my0Var = (my0) ((di.n4) this.f50656b).f9364e;
                if (my0Var != null) {
                    my0Var.run();
                    return;
                }
                return;
            case 1:
                ((uy0) this.f50656b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f50656b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43714a);
                    org.telegram.messenger.lv lvVar = saveToGallerySettingsActivity.f43716c;
                    m10.put(lvVar.d, lvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43714a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.a30) this.f50656b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50656b;
                org.telegram.messenger.gj gjVar = secretMediaViewer.f43741g0;
                if (gjVar != null) {
                    TLRPC.Message message = gjVar.f24177k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.l3 l3Var = secretMediaViewer.f43761r;
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
                b21 b21Var = (b21) this.f50656b;
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
                SessionsActivity sessionsActivity = ((a31) this.f50656b).f45457f;
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
                h61 h61Var = (h61) this.f50656b;
                org.telegram.messenger.cz.H0 = !org.telegram.messenger.cz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.cz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.m6.k(false, false);
                h61Var.f48213c.setChecked(org.telegram.messenger.cz.H0);
                org.telegram.ui.Cells.ba baVar = h61Var.f48211a;
                for (org.telegram.ui.Cells.r1 r1Var : baVar.getCells()) {
                    r1Var.getMessageObject().S1 = false;
                    r1Var.H1();
                    r1Var.requestLayout();
                }
                baVar.invalidate();
                org.telegram.messenger.ls.e().k(279, new Object[0]);
                return;
            case 8:
                ((i81) this.f50656b).c(true);
                return;
            case 9:
                ((i81) ((di.i4) this.f50656b).f9002c).c(true);
                return;
            case 10:
                p81 p81Var = (p81) this.f50656b;
                ArrayList arrayList = p81Var.f50786f;
                HashSet hashSet = p81Var.f50791x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User c22 = p81Var.getMessagesController().c2(Long.valueOf(p81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f28398id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        p81Var.getMessagesController().X3(chat, false);
                        p81Var.getMessagesController().f0(chat.f28398id, c22);
                    }
                    p81Var.finishFragment();
                    return;
                }
                return;
            default:
                zc1 zc1Var = (zc1) this.f50656b;
                zc1Var.f54490a.c(!d2Var.b(), true);
                zc1Var.f54492c.setEnabled(zc1Var.f54490a.b());
                ViewPropertyAnimator animate = zc1Var.f54492c.animate();
                if (zc1Var.f54490a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
