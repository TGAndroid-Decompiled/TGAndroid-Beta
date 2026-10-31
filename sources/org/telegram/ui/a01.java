package org.telegram.ui;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class a01 implements View.OnClickListener {
    public final int f35503a;
    public final Object f35504b;

    public a01(Object obj, int i10) {
        this.f35503a = i10;
        this.f35504b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q1[] cells;
        org.telegram.ui.Cells.c2 c2Var;
        float f7;
        switch (this.f35503a) {
            case 0:
                yz0 yz0Var = (yz0) ((jg.b1) this.f35504b).e;
                if (yz0Var != null) {
                    yz0Var.run();
                    return;
                }
                return;
            case 1:
                ((g01) this.f35504b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f35504b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray m10 = saveToGallerySettingsActivity.getUserConfig().m(saveToGallerySettingsActivity.f33967a);
                    org.telegram.messenger.bw bwVar = saveToGallerySettingsActivity.f33969c;
                    m10.put(bwVar.d, bwVar);
                    saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.f33967a, m10);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((org.telegram.ui.Components.e30) this.f35504b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35504b;
                org.telegram.messenger.jj jjVar = secretMediaViewer.f33990f0;
                if (jjVar != null) {
                    TLRPC.Message message = jjVar.f16337k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        vh.p2 p2Var = secretMediaViewer.f34013r;
                        if (p2Var.V) {
                            p2Var.e(true);
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
                s31 s31Var = (s31) this.f35504b;
                if (s31Var.S1 instanceof TLRPC.User) {
                    vh.d dVar = s31Var.Z1;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        s31Var.e1((TLRPC.User) s31Var.S1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity = ((q41) this.f35504b).f40869f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    u9.i0(sessionsActivity.getParentActivity(), 2, new o41(sessionsActivity));
                    return;
                }
                return;
            case 7:
                y71 y71Var = (y71) this.f35504b;
                org.telegram.messenger.tz.H0 = !org.telegram.messenger.tz.H0;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                edit.putBoolean("compactMode", org.telegram.messenger.tz.H0);
                edit.apply();
                org.telegram.ui.ActionBar.t6.k(false, false);
                y71Var.f43753c.setChecked(org.telegram.messenger.tz.H0);
                org.telegram.ui.Cells.z9 z9Var = y71Var.f43751a;
                for (org.telegram.ui.Cells.q1 q1Var : z9Var.getCells()) {
                    q1Var.getMessageObject().Q1 = false;
                    q1Var.E1();
                    q1Var.requestLayout();
                }
                z9Var.invalidate();
                org.telegram.messenger.zs.e().k(276, new Object[0]);
                return;
            case 8:
                ((x91) this.f35504b).c(true);
                return;
            case 9:
                ((x91) ((mg.s) this.f35504b).f13227c).c(true);
                return;
            case 10:
                ea1 ea1Var = (ea1) this.f35504b;
                ArrayList arrayList = ea1Var.f37002f;
                HashSet hashSet = ea1Var.f37007x;
                if (!hashSet.isEmpty()) {
                    TLRPC.User Z1 = ea1Var.getMessagesController().Z1(Long.valueOf(ea1Var.getUserConfig().e()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19793id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ea1Var.getMessagesController().N3(chat, false);
                        ea1Var.getMessagesController().f0(chat.f19793id, Z1);
                    }
                    ea1Var.finishFragment();
                    return;
                }
                return;
            default:
                te1 te1Var = (te1) this.f35504b;
                te1Var.f41826a.c(!c2Var.b(), true);
                te1Var.f41828c.setEnabled(te1Var.f41826a.b());
                ViewPropertyAnimator animate = te1Var.f41828c.animate();
                if (te1Var.f41826a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}
