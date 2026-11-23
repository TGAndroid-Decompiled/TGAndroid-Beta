package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ny0 implements View.OnClickListener {
    public final int f50446a;
    public final Object f50447b;

    public ny0(Object obj, int i7) {
        this.f50446a = i7;
        this.f50447b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.r1[] cells;
        org.telegram.ui.Cells.d2 d2Var;
        float f10;
        switch (this.f50446a) {
            case 0:
                ly0 ly0Var = (ly0) ((di.n4) this.f50447b).f9358e;
                if (ly0Var != null) {
                    ly0Var.run();
                    return;
                }
                return;
            case 1:
                ((ty0) this.f50447b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f50447b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f43830a);
                    org.telegram.messenger.kv kvVar = saveToGallerySettingsActivity.f43832c;
                    m10.put(kvVar.d, kvVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f43830a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.x20) this.f50447b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50447b;
                org.telegram.messenger.fj fjVar = secretMediaViewer.f43857g0;
                if (fjVar != null) {
                    TLRPC.Message message = fjVar.f24073k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hi.u3 u3Var = secretMediaViewer.f43877r;
                        if (u3Var.W) {
                            u3Var.f(true);
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
                a21 a21Var = (a21) this.f50447b;
                if (a21Var.W1 instanceof TLRPC.User) {
                    hi.e eVar = a21Var.d2;
                    if (!eVar.R) {
                        eVar.setLoading(true);
                        a21Var.f1((TLRPC.User) a21Var.W1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((z21) this.f50447b).f54506f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    t9.j0(sessionsActivity.getParentActivity(), 2, new x21(sessionsActivity));
                    return;
                }
                return;
            case 7:
                f61 f61Var = (f61) this.f50447b;
                org.telegram.messenger.bz.H0 = !org.telegram.messenger.bz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.bz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.n6.k(false, false);
                f61Var.f47704c.setChecked(org.telegram.messenger.bz.H0);
                org.telegram.ui.Cells.ba baVar = f61Var.f47702a;
                for (org.telegram.ui.Cells.r1 r1Var : baVar.getCells()) {
                    r1Var.getMessageObject().S1 = false;
                    r1Var.H1();
                    r1Var.requestLayout();
                }
                baVar.invalidate();
                org.telegram.messenger.ks.e().k(279, new Object[0]);
                return;
            case 8:
                ((g81) this.f50447b).c(true);
                return;
            case 9:
                ((g81) ((di.i4) this.f50447b).f8999c).c(true);
                return;
            case 10:
                n81 n81Var = (n81) this.f50447b;
                ArrayList arrayList = n81Var.f50265f;
                HashSet hashSet = n81Var.f50270x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User c22 = n81Var.getMessagesController().c2(Long.valueOf(n81Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i7)).f28492id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i7));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i10);
                        n81Var.getMessagesController().X3(chat, false);
                        n81Var.getMessagesController().f0(chat.f28492id, c22);
                    }
                    n81Var.finishFragment();
                    return;
                }
                return;
            default:
                xc1 xc1Var = (xc1) this.f50447b;
                xc1Var.f53915a.c(!d2Var.b(), true);
                xc1Var.f53917c.setEnabled(xc1Var.f53915a.b());
                ViewPropertyAnimator animate = xc1Var.f53917c.animate();
                if (xc1Var.f53915a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}
