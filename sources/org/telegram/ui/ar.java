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
    public final int f35826a;
    public final Object f35827b;

    public ar(Object obj, int i10) {
        this.f35826a = i10;
        this.f35827b = obj;
    }

    @Override
    public final void b(int i10) {
        Runnable runnable;
        int i11;
        org.telegram.ui.ActionBar.i5 i5Var;
        jx jxVar;
        int i12;
        long j10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i13 = this.f35826a;
        Object obj = this.f35827b;
        switch (i13) {
            case 0:
                pr prVar = (pr) obj;
                if (i10 == -1) {
                    if (prVar.l0(true)) {
                        prVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    prVar.z0();
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
                    if (!biVar.f24812s2.j()) {
                        biVar.dismiss();
                        return;
                    }
                    return;
                }
                biVar.f24812s2.w(i10);
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
                    if (!n90Var.R.U(true)) {
                        n90Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 10) {
                    org.telegram.ui.Components.m90 m90Var = n90Var.R;
                    m90Var.n1(m90Var.getClosestTab(), false);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.pe0) obj).f29415r) != null) {
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
                ((org.telegram.ui.Components.pp0) obj).onBackPressed();
                return;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.s51) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.f0) obj).b(false, false);
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((sd1) obj).a(false, false);
                    return;
                }
                return;
            case 12:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i10 == -1) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                    if (i5Var.s()) {
                        contactsActivity.m0();
                        return;
                    } else {
                        contactsActivity.finishFragment();
                        return;
                    }
                } else if (i10 == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.Z;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    if (m10 == 1) {
                        x1Var.R = org.telegram.messenger.dd.L0(2131751551, null);
                        x1Var.T = org.telegram.messenger.dd.L0(2131751552, null);
                    } else {
                        x1Var.R = org.telegram.messenger.dd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        x1Var.T = org.telegram.messenger.dd.L0(2131751550, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new qs(contactsActivity));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Components.a21(6));
                    x1Var.show();
                    x1Var.i();
                    return;
                } else if (i10 == 1) {
                    org.telegram.messenger.uz.L0 = !org.telegram.messenger.uz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.uz.L0);
                    edit.apply();
                    contactsActivity.f33303r = org.telegram.messenger.uz.L0;
                    org.telegram.ui.ActionBar.p5 p5Var = contactsActivity.f33301n;
                    if (p5Var != null) {
                        org.telegram.ui.Components.fi0 iconView = p5Var.getIconView();
                        if (contactsActivity.f33303r) {
                            i11 = 2131232101;
                        } else {
                            i11 = 2131232100;
                        }
                        org.telegram.messenger.i0.Q3(iconView, i11);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f33292e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.f33285a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.gr.f26524g).withEndAction(new ps(contactsActivity, 0));
                    contactsActivity.f33292e0 = withEndAction;
                    withEndAction.start();
                    return;
                } else {
                    return;
                }
            case 13:
                if (i10 == -1) {
                    ((qt) obj).finishFragment();
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
                    ((lu) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i10 == -1) {
                    ((cv) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                zx zxVar = (zx) obj;
                ArrayList arrayList = zxVar.I2;
                if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (jxVar = zxVar.C0) != null) {
                    HashMap hashMap = jxVar.B0;
                    zx zxVar2 = jxVar.L0;
                    if (i10 == 202) {
                        if (zxVar2 != null && zxVar2.getParentActivity() != null) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zxVar2.getParentActivity());
                            String G = org.telegram.messenger.dd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                            x1Var2.R = G;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.dd.L0(2131746334, null));
                            x1Var2.T = spannableStringBuilder;
                            alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Components.au(18));
                            alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.Components.f2(17, jxVar, arrayList2));
                            TextView textView = (TextView) alertDialog$Builder2.p().d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i10 == 203) {
                        if (jxVar.O()) {
                            zxVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) zxVar2, 2, true));
                            return;
                        }
                        return;
                    } else if (i10 == 200) {
                        if (hashMap.size() == 1) {
                            jxVar.c((org.telegram.messenger.kj) hashMap.values().iterator().next());
                            return;
                        }
                        return;
                    } else if (i10 == 201) {
                        zx zxVar3 = new zx(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
                        zxVar3.C2 = new org.telegram.ui.Components.px(jxVar, 18);
                        zxVar2.presentFragment(zxVar3);
                        return;
                    } else {
                        return;
                    }
                } else if (i10 == -1) {
                    ww wwVar = zxVar.F3;
                    if (wwVar != null && wwVar.c()) {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                        if (lVar2.u()) {
                            jx jxVar2 = zxVar.C0;
                            if (jxVar2 != null && jxVar2.getVisibility() == 0) {
                                jx jxVar3 = zxVar.C0;
                                if (jxVar3.A0) {
                                    jxVar3.R(false);
                                    return;
                                }
                            }
                            zxVar.n4(true);
                            return;
                        }
                        zxVar.F3.a();
                        jx jxVar4 = zxVar.C0;
                        if (jxVar4 != null) {
                            jxVar4.S();
                            return;
                        }
                        return;
                    }
                    px pxVar = zxVar.f44243z0;
                    if (pxVar == null || !pxVar.f30763n) {
                        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                        if (lVar.u()) {
                            jx jxVar5 = zxVar.C0;
                            if (jxVar5 != null && jxVar5.getVisibility() == 0) {
                                jx jxVar6 = zxVar.C0;
                                if (jxVar6.A0) {
                                    jxVar6.R(false);
                                    return;
                                }
                            }
                            zxVar.n4(true);
                            return;
                        } else if (zxVar.f44174l2 || zxVar.W2 != 0 || zxVar.Y2 != 0) {
                            zxVar.finishFragment();
                            return;
                        } else {
                            return;
                        }
                    }
                    pxVar.setIsEditing(false);
                    zxVar.U4(false);
                    return;
                } else if (i10 == 1) {
                    if (zxVar.getParentActivity() != null) {
                        org.telegram.messenger.uz.f18563x = true;
                        org.telegram.messenger.uz.y();
                        int[] iArr = new int[2];
                        zxVar.f44143f0.getLocationInWindow(iArr);
                        ((LaunchActivity) zxVar.getParentActivity()).K0(false, true, (zxVar.f44143f0.getMeasuredWidth() / 2) + iArr[0], (zxVar.f44143f0.getMeasuredHeight() / 2) + iArr[1], new rh(this, 23));
                        zxVar.getNotificationsController().Y();
                        zxVar.K3();
                        return;
                    }
                    return;
                } else if (i10 == 3) {
                    zxVar.a5(true, true, true, false);
                    zxVar.Y.b(true);
                    return;
                } else if (i10 == 11) {
                    zxVar.B4(zxVar.D1);
                    return;
                } else if (i10 == 109) {
                    org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(zxVar, arrayList);
                    uzVar.f31124q1 = new st(this, 6);
                    zxVar.showDialog(uzVar);
                    return;
                } else if (i10 == 110) {
                    org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) zxVar.getMessagesController().S0().get(zxVar.f44137e0[0].h);
                    ArrayList J0 = org.telegram.ui.Components.uz.J0(zxVar, bpVar, arrayList, false, false);
                    if (bpVar != null) {
                        i12 = bpVar.f15005i.size();
                    } else {
                        i12 = 0;
                    }
                    if (J0.size() + i12 > 100) {
                        zxVar.showDialog(org.telegram.ui.Components.s4.M(zxVar.getParentActivity(), org.telegram.messenger.dd.L0(2131750811, null), org.telegram.messenger.dd.L0(2131750812, null)).f20135a);
                        return;
                    }
                    if (!J0.isEmpty()) {
                        bpVar.f15005i.addAll(J0);
                        for (int i14 = 0; i14 < J0.size(); i14++) {
                            Long l4 = (Long) J0.get(i14);
                            bpVar.h.remove(l4);
                            bpVar.f15006j.delete(l4.longValue());
                        }
                        if (bpVar.d()) {
                            bpVar.f15005i.clear();
                        }
                        h00.z0(bpVar, bpVar.f15004g, bpVar.f15001b, bpVar.f15002c, bpVar.f15010n, bpVar.f15009m, bpVar.h, bpVar.f15005i, bpVar.f15006j, false, false, true, false, false, zxVar, null);
                    }
                    if (J0.size() == 1) {
                        j10 = ((Long) J0.get(0)).longValue();
                    } else {
                        j10 = 0;
                    }
                    UndoView k42 = zxVar.k4();
                    if (k42 != null) {
                        k42.k(j10, 21, Integer.valueOf(J0.size()), bpVar, null, null);
                    }
                    zxVar.n4(false);
                    return;
                } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                    zxVar.D4(zxVar.I2, i10, true, false, null);
                    return;
                } else {
                    return;
                }
            case 19:
                hy hyVar = (hy) obj;
                int i15 = hyVar.f37890x;
                ArrayList arrayList3 = hyVar.e;
                int i16 = hyVar.f37891y;
                if (i10 == -1) {
                    if (hyVar.D == null) {
                        hyVar.d0();
                        return;
                    } else {
                        hyVar.finishFragment();
                        return;
                    }
                } else if (i10 == 1 && hyVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        arrayList4.add(org.telegram.messenger.hs.a(((Long) arrayList3.get(i17)).longValue(), 0L));
                    }
                    org.telegram.messenger.is messagesStorage = hyVar.getMessagesStorage();
                    messagesStorage.f16331a.c(new org.telegram.messenger.aq(messagesStorage, i16, arrayList4, 1));
                    SharedPreferences.Editor edit2 = hyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    edit2.putInt("account" + i16, hy.a0(hyVar));
                    edit2.putInt("type" + i16, i15);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(hyVar.getParentActivity());
                    if (i15 == 0) {
                        ChatsWidgetProvider.a(hyVar.getParentActivity(), appWidgetManager, i16);
                    } else {
                        ContactsWidgetProvider.a(hyVar.getParentActivity(), appWidgetManager, i16);
                    }
                    y0 y0Var = hyVar.D;
                    if (y0Var != null) {
                        int i18 = y0Var.f43493a;
                        Object obj2 = y0Var.f43494b;
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
                    hyVar.d0();
                    return;
                } else {
                    return;
                }
            case 20:
                if (i10 == -1) {
                    ((py) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                hz hzVar = (hz) obj;
                if (i10 == -1) {
                    if (hzVar.b0(true)) {
                        hzVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    hzVar.h0();
                    return;
                } else {
                    return;
                }
            case 22:
                h00 h00Var = (h00) obj;
                if (i10 == -1) {
                    if (h00Var.n0(true)) {
                        h00Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    h00Var.w0();
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
                    ((o10) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                u50 u50Var = (u50) obj;
                if (i10 == -1) {
                    if (u50Var.k0(true)) {
                        u50Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    u50Var.t0();
                    return;
                } else {
                    return;
                }
            case 26:
                if (i10 == -1) {
                    ((b60) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((d60) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((j60) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((m60) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
