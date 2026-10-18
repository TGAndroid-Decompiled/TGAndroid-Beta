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
public final class ew extends org.telegram.ui.ActionBar.j {
    public final ey f36620a;

    public ew(ey eyVar) {
        this.f36620a = eyVar;
    }

    @Override
    public final void b(int i10) {
        nx nxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.f36620a;
        ArrayList arrayList3 = eyVar.I2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (nxVar = eyVar.C0) != null) {
            HashMap hashMap = nxVar.f31370z0;
            ey eyVar2 = nxVar.J0;
            if (i10 == 202) {
                if (eyVar2 != null && eyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar2.getParentActivity());
                    alertDialog$Builder.f20608a.R = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f20608a.T = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.tg0(4));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.q2(19, nxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (nxVar.N()) {
                    eyVar2.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) eyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    nxVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                ey eyVar3 = new ey(org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true));
                eyVar3.C2 = new org.telegram.ui.Components.tv(nxVar, 18);
                eyVar2.presentFragment(eyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            yw ywVar = eyVar.G3;
            if (ywVar != null && ywVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                if (kVar2.s()) {
                    nx nxVar2 = eyVar.C0;
                    if (nxVar2 != null && nxVar2.getVisibility() == 0) {
                        nx nxVar3 = eyVar.C0;
                        if (nxVar3.f31369y0) {
                            nxVar3.Q(false);
                            return;
                        }
                    }
                    eyVar.Z3(true);
                    return;
                }
                eyVar.G3.a();
                nx nxVar4 = eyVar.C0;
                if (nxVar4 != null) {
                    nxVar4.R();
                    return;
                }
                return;
            }
            cw cwVar = eyVar.f36759z0;
            if (cwVar == null || !cwVar.f30115n) {
                kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                if (kVar.s()) {
                    nx nxVar5 = eyVar.C0;
                    if (nxVar5 != null && nxVar5.getVisibility() == 0) {
                        nx nxVar6 = eyVar.C0;
                        if (nxVar6.f31369y0) {
                            nxVar6.Q(false);
                            return;
                        }
                    }
                    eyVar.Z3(true);
                    return;
                } else if (eyVar.f36690l2 || eyVar.W2 != 0 || eyVar.Y2 != 0) {
                    eyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            cwVar.setIsEditing(false);
            eyVar.G4(false);
        } else if (i10 == 1) {
            if (eyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                eyVar.f36659f0.getLocationInWindow(iArr);
                ((LaunchActivity) eyVar.getParentActivity()).K0(false, true, (eyVar.f36659f0.getMeasuredWidth() / 2) + iArr[0], (eyVar.f36659f0.getMeasuredHeight() / 2) + iArr[1], new vi(this, 25));
                eyVar.getNotificationsController().showNotifications();
                eyVar.w3();
            }
        } else if (i10 == 3) {
            eyVar.M4(true, true, true, false);
            eyVar.Y.b(true);
        } else if (i10 == 11) {
            eyVar.n4(eyVar.D1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(eyVar, arrayList3);
            v00Var.f31132r = new wt(this, 4);
            eyVar.showDialog(v00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = eyVar.getMessagesController().getDialogFilters().get(eyVar.f36653e0[0].h);
            ArrayList J = org.telegram.ui.Components.v00.J(eyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (J.size() + i11 > 100) {
                eyVar.showDialog(org.telegram.ui.Components.f5.M(eyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f20608a);
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
                p00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, eyVar, null);
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
            UndoView W3 = eyVar.W3();
            if (W3 != null) {
                W3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            eyVar.Z3(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            eyVar.p4(eyVar.I2, i10, true, false, null);
        }
    }
}
