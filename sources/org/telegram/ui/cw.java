package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class cw extends org.telegram.ui.ActionBar.j {
    public final cy f36058a;

    public cw(cy cyVar) {
        this.f36058a = cyVar;
    }

    @Override
    public final void b(int i10) {
        lx lxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.f36058a;
        ArrayList arrayList3 = cyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (lxVar = cyVar.C0) != null) {
            HashMap hashMap = lxVar.f32201z0;
            cy cyVar2 = lxVar.J0;
            if (i10 == 202) {
                if (cyVar2 != null && cyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar2.getParentActivity());
                    alertDialog$Builder.f20605a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f20605a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ug0(4));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.q2(19, lxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (lxVar.N()) {
                    cyVar2.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) cyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    lxVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                cy cyVar3 = new cy(org.telegram.messenger.mk.d(3, "onlySelect", "dialogsType", true));
                cyVar3.C2 = new org.telegram.ui.Components.tv(lxVar, 18);
                cyVar2.presentFragment(cyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            ww wwVar = cyVar.G3;
            if (wwVar != null && wwVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                if (kVar2.t()) {
                    lx lxVar2 = cyVar.C0;
                    if (lxVar2 != null && lxVar2.getVisibility() == 0) {
                        lx lxVar3 = cyVar.C0;
                        if (lxVar3.f32200y0) {
                            lxVar3.Q(false);
                            return;
                        }
                    }
                    cyVar.Z3(true);
                    return;
                }
                cyVar.G3.a();
                lx lxVar4 = cyVar.C0;
                if (lxVar4 != null) {
                    lxVar4.R();
                    return;
                }
                return;
            }
            aw awVar = cyVar.f36197z0;
            if (awVar == null || !awVar.f30080n) {
                kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                if (kVar.t()) {
                    lx lxVar5 = cyVar.C0;
                    if (lxVar5 != null && lxVar5.getVisibility() == 0) {
                        lx lxVar6 = cyVar.C0;
                        if (lxVar6.f32200y0) {
                            lxVar6.Q(false);
                            return;
                        }
                    }
                    cyVar.Z3(true);
                    return;
                } else if (cyVar.f36128l2 || cyVar.W2 != 0 || cyVar.Y2 != 0) {
                    cyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            awVar.setIsEditing(false);
            cyVar.G4(false);
        } else if (i10 == 1) {
            if (cyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                cyVar.f36097f0.getLocationInWindow(iArr);
                ((LaunchActivity) cyVar.getParentActivity()).K0(false, true, (cyVar.f36097f0.getMeasuredWidth() / 2) + iArr[0], (cyVar.f36097f0.getMeasuredHeight() / 2) + iArr[1], new ti(this, 25));
                cyVar.getNotificationsController().showNotifications();
                cyVar.w3();
            }
        } else if (i10 == 3) {
            cyVar.M4(true, true, true, false);
            cyVar.Y.b(true);
        } else if (i10 == 11) {
            cyVar.n4(cyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(cyVar, arrayList3);
            v00Var.f31103r = new ut(this, 4);
            cyVar.showDialog(v00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = cyVar.getMessagesController().getDialogFilters().get(cyVar.f36091e0[0].h);
            ArrayList J = org.telegram.ui.Components.v00.J(cyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (J.size() + i11 > 100) {
                cyVar.showDialog(org.telegram.ui.Components.f5.M(cyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f20605a);
                return;
            }
            if (!J.isEmpty()) {
                dialogFilter2.neverShow.addAll(J);
                for (int i13 = 0; i13 < J.size(); i13++) {
                    Long l4 = (Long) J.get(i13);
                    dialogFilter2.alwaysShow.remove(l4);
                    dialogFilter2.pinnedDialogs.delete(l4.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = J;
                i12 = 1;
                n00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, cyVar, null);
            } else {
                arrayList = J;
                dialogFilter = dialogFilter2;
                i12 = 1;
            }
            if (arrayList.size() == i12) {
                arrayList2 = arrayList;
                z10 = false;
                j10 = ((Long) arrayList2.get(0)).longValue();
            } else {
                arrayList2 = arrayList;
                z10 = false;
            }
            long j11 = j10;
            UndoView W3 = cyVar.W3();
            if (W3 != null) {
                W3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            cyVar.Z3(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            cyVar.p4(cyVar.I2, i10, true, false, null);
        }
    }
}
