package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class ar extends org.telegram.ui.ActionBar.k {
    public final int f35698a;
    public final Object f35699b;

    public ar(Object obj, int i10) {
        this.f35698a = i10;
        this.f35699b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11;
        org.telegram.ui.ActionBar.i5 i5Var;
        kx kxVar;
        int i12;
        long j10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i13 = this.f35698a;
        Object obj = this.f35699b;
        switch (i13) {
            case 0:
                pr prVar = (pr) obj;
                if (i10 == -1) {
                    if (prVar.k0(true)) {
                        prVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    prVar.y0();
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) obj;
                if (i10 == -1) {
                    w7Var.dismiss();
                    return;
                } else {
                    w7Var.P0(i10);
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ha) obj).dismiss();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) obj;
                if (i10 == -1) {
                    if (!biVar.f24721s2.j()) {
                        biVar.dismiss();
                        return;
                    }
                    return;
                }
                biVar.f24721s2.w(i10);
                return;
            case 4:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.j30) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) obj;
                if (i10 == -1) {
                    if (!n90Var.R.T(true)) {
                        n90Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 10) {
                    org.telegram.ui.Components.m90 m90Var = n90Var.R;
                    m90Var.m1(m90Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.pe0) obj).f29350r) != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.tf0) obj).dismiss();
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.op0) obj).onBackPressed();
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.r51) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.e0) obj).b(false, false);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((ud1) obj).a(false, false);
                    return;
                }
                return;
            case 12:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i10 == -1) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                    if (i5Var.s()) {
                        contactsActivity.l0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i10 == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.Z;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    if (m10 == 1) {
                        x1Var.R = org.telegram.messenger.cd.L0(2131751551, null);
                        x1Var.T = org.telegram.messenger.cd.L0(2131751552, null);
                    } else {
                        x1Var.R = org.telegram.messenger.cd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        x1Var.T = org.telegram.messenger.cd.L0(2131751550, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new qs(contactsActivity));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(6));
                    x1Var.show();
                    x1Var.i();
                    return;
                } else if (i10 == 1) {
                    org.telegram.messenger.tz.L0 = !org.telegram.messenger.tz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.tz.L0);
                    edit.apply();
                    contactsActivity.f33296r = org.telegram.messenger.tz.L0;
                    org.telegram.ui.ActionBar.p5 p5Var = contactsActivity.f33294n;
                    if (p5Var != null) {
                        org.telegram.ui.Components.ei0 iconView = p5Var.getIconView();
                        if (contactsActivity.f33296r) {
                            i11 = 2131232101;
                        } else {
                            i11 = 2131232100;
                        }
                        org.telegram.messenger.i0.Q3(iconView, i11);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f33285e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f33278a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.gr.f26496g).withEndAction(new ps(contactsActivity, 0));
                    contactsActivity.f33285e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 13:
                if (i10 == -1) {
                    ((rt) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((mu) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((dv) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                ay ayVar = (ay) obj;
                ArrayList arrayList = ayVar.I2;
                if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (kxVar = ayVar.C0) != null) {
                    HashMap hashMap = kxVar.B0;
                    ay ayVar2 = kxVar.L0;
                    if (i10 == 202) {
                        if (ayVar2 != null && ayVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ayVar2.getParentActivity());
                            String G = org.telegram.messenger.cd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                            x1Var2.R = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.cd.L0(2131746334, null));
                            x1Var2.T = spannableStringBuilder;
                            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.au(18));
                            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.Components.f2(17, kxVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder2.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i10 == 203) {
                        if (kxVar.O()) {
                            ayVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) ayVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i10 == 200) {
                        if (hashMap.size() == 1) {
                            kxVar.c((org.telegram.messenger.jj) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i10 == 201) {
                        ay ayVar3 = new ay(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
                        ayVar3.C2 = new org.telegram.ui.Components.px(kxVar, 18);
                        ayVar2.presentFragment(ayVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i10 == -1) {
                    xw xwVar = ayVar.F3;
                    if (xwVar != null && xwVar.c()) {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                        if (lVar2.u()) {
                            kx kxVar2 = ayVar.C0;
                            if (kxVar2 != null && kxVar2.getVisibility() == 0) {
                                kx kxVar3 = ayVar.C0;
                                if (kxVar3.A0) {
                                    kxVar3.R(false);
                                    return;
                                }
                            }
                            ayVar.m4(true);
                            return;
                        }
                        ayVar.F3.a();
                        kx kxVar4 = ayVar.C0;
                        if (kxVar4 != null) {
                            kxVar4.S();
                            return;
                        }
                        return;
                    }
                    qx qxVar = ayVar.f35900z0;
                    if (qxVar == null || !qxVar.f30717n) {
                        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                        if (lVar.u()) {
                            kx kxVar5 = ayVar.C0;
                            if (kxVar5 != null && kxVar5.getVisibility() == 0) {
                                kx kxVar6 = ayVar.C0;
                                if (kxVar6.A0) {
                                    kxVar6.R(false);
                                    return;
                                }
                            }
                            ayVar.m4(true);
                            return;
                        } else if (ayVar.f35831l2 || ayVar.W2 != 0 || ayVar.Y2 != 0) {
                            ayVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    qxVar.setIsEditing(false);
                    ayVar.T4(false);
                    return;
                } else if (i10 == 1) {
                    if (ayVar.getParentActivity() != null) {
                        org.telegram.messenger.tz.f18194x = true;
                        org.telegram.messenger.tz.y();
                        int[] iArr = new int[2];
                        ayVar.f35800f0.getLocationInWindow(iArr);
                        ((LaunchActivity) ayVar.getParentActivity()).K0(false, true, (ayVar.f35800f0.getMeasuredWidth() / 2) + iArr[0], (ayVar.f35800f0.getMeasuredHeight() / 2) + iArr[1], new rh(this, 23));
                        ayVar.getNotificationsController().Y();
                        ayVar.J3();
                        return;
                    }
                    return;
                } else if (i10 == 3) {
                    ayVar.Z4(true, true, true, false);
                    ayVar.Y.b(true);
                    return;
                } else if (i10 == 11) {
                    ayVar.A4(ayVar.D1);
                    return;
                } else if (i10 == 109) {
                    org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(ayVar, arrayList);
                    uzVar.f31097q1 = new tt(this, 6);
                    ayVar.showDialog(uzVar);
                    return;
                } else if (i10 == 110) {
                    org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) ayVar.getMessagesController().S0().get(ayVar.f35794e0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.uz.J0(ayVar, apVar, arrayList, false, false);
                    if (apVar != null) {
                        i12 = apVar.f14650i.size();
                    } else {
                        i12 = 0;
                    }
                    if (J0.size() + i12 > 100) {
                        ayVar.showDialog(org.telegram.ui.Components.s4.M(ayVar.getParentActivity(), org.telegram.messenger.cd.L0(2131750811, null), org.telegram.messenger.cd.L0(2131750812, null)).f20134a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        apVar.f14650i.addAll(J0);
                        for (int i14 = 0; i14 < J0.size(); i14++) {
                            Long l4 = (Long) J0.get(i14);
                            apVar.h.remove(l4);
                            apVar.f14651j.delete(l4.longValue());
                        }
                        if (apVar.d()) {
                            apVar.f14650i.clear();
                        }
                        i00.y0(apVar, apVar.f14649g, apVar.f14646b, apVar.f14647c, apVar.f14655n, apVar.f14654m, apVar.h, apVar.f14650i, apVar.f14651j, false, false, true, false, false, ayVar, null);
                    }
                    if (J0.size() == 1) {
                        j10 = ((Long) J0.get(0)).longValue();
                    } else {
                        j10 = 0;
                    }
                    UndoView j42 = ayVar.j4();
                    if (j42 != null) {
                        j42.k(j10, 21, Integer.valueOf(J0.size()), apVar, null, null);
                    }
                    ayVar.m4(false);
                    return;
                } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                    ayVar.C4(ayVar.I2, i10, true, false, null);
                    return;
                } else {
                    return;
                }
            case 19:
                iy iyVar = (iy) obj;
                int i15 = iyVar.f38372x;
                ArrayList arrayList3 = iyVar.e;
                int i16 = iyVar.f38373y;
                if (i10 == -1) {
                    if (iyVar.D == null) {
                        iyVar.c0();
                        return;
                    } else {
                        iyVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1 && iyVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        arrayList4.add(org.telegram.messenger.gs.a(((Long) arrayList3.get(i17)).longValue(), 0L));
                    }
                    org.telegram.messenger.hs messagesStorage = iyVar.getMessagesStorage();
                    messagesStorage.f15938a.c(new org.telegram.messenger.zp(messagesStorage, i16, arrayList4, 1));
                    SharedPreferences.Editor edit2 = iyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    edit2.putInt("account" + i16, iy.Z(iyVar));
                    edit2.putInt("type" + i16, i15);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(iyVar.getParentActivity());
                    if (i15 == 0) {
                        ChatsWidgetProvider.a(iyVar.getParentActivity(), appWidgetManager, i16);
                    } else {
                        ContactsWidgetProvider.a(iyVar.getParentActivity(), appWidgetManager, i16);
                    }
                    y0 y0Var = iyVar.D;
                    if (y0Var != null) {
                        int i18 = y0Var.f43673a;
                        Object obj2 = y0Var.f43674b;
                        switch (i18) {
                            case 27:
                                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj2;
                                int i19 = ChatsWidgetConfigActivity.F;
                                Intent intent = new Intent();
                                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                                chatsWidgetConfigActivity.setResult(-1, intent);
                                chatsWidgetConfigActivity.finish();
                                return;
                            default:
                                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj2;
                                int i20 = ContactsWidgetConfigActivity.F;
                                Intent intent2 = new Intent();
                                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                                contactsWidgetConfigActivity.setResult(-1, intent2);
                                contactsWidgetConfigActivity.finish();
                                return;
                        }
                    }
                    iyVar.c0();
                    return;
                } else {
                    return;
                }
            case 20:
                if (i10 == -1) {
                    ((qy) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                iz izVar = (iz) obj;
                if (i10 == -1) {
                    if (izVar.a0(true)) {
                        izVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    izVar.g0();
                    return;
                } else {
                    return;
                }
            case 22:
                i00 i00Var = (i00) obj;
                if (i10 == -1) {
                    if (i00Var.m0(true)) {
                        i00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    i00Var.v0();
                    return;
                } else {
                    return;
                }
            case 23:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((p10) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                v50 v50Var = (v50) obj;
                if (i10 == -1) {
                    if (v50Var.j0(true)) {
                        v50Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    v50Var.s0();
                    return;
                } else {
                    return;
                }
            case 26:
                if (i10 == -1) {
                    ((c60) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((e60) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((k60) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((n60) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
