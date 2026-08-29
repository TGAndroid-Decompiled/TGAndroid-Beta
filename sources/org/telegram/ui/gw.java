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
public final class gw extends org.telegram.ui.ActionBar.k {
    public final fy f38676a;

    public gw(fy fyVar) {
        this.f38676a = fyVar;
    }

    @Override
    public final void b(int i10) {
        ox oxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        fy fyVar = this.f38676a;
        ArrayList arrayList3 = fyVar.E2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (oxVar = fyVar.f38377y0) != null) {
            HashMap hashMap = oxVar.f33008v0;
            fy fyVar2 = oxVar.F0;
            if (i10 == 202) {
                if (fyVar2 != null && fyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fyVar2.getParentActivity());
                    alertDialog$Builder.f22714a.N = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f22714a.P = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.r2(27));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.j1(23, oxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (oxVar.N()) {
                    fyVar2.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) fyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    oxVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                fy fyVar3 = new fy(org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true));
                fyVar3.f38379y2 = new org.telegram.ui.Components.cv(oxVar, 17);
                fyVar2.presentFragment(fyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            ax axVar = fyVar.B3;
            if (axVar != null && axVar.c()) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (lVar2.s()) {
                    ox oxVar2 = fyVar.f38377y0;
                    if (oxVar2 != null && oxVar2.getVisibility() == 0) {
                        ox oxVar3 = fyVar.f38377y0;
                        if (oxVar3.f33007u0) {
                            oxVar3.Q(false);
                            return;
                        }
                    }
                    fyVar.b4(true);
                    return;
                }
                fyVar.B3.a();
                ox oxVar4 = fyVar.f38377y0;
                if (oxVar4 != null) {
                    oxVar4.R();
                    return;
                }
                return;
            }
            ew ewVar = fyVar.f38362v0;
            if (ewVar == null || !ewVar.f28243n) {
                lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (lVar.s()) {
                    ox oxVar5 = fyVar.f38377y0;
                    if (oxVar5 != null && oxVar5.getVisibility() == 0) {
                        ox oxVar6 = fyVar.f38377y0;
                        if (oxVar6.f33007u0) {
                            oxVar6.Q(false);
                            return;
                        }
                    }
                    fyVar.b4(true);
                    return;
                } else if (fyVar.f38295h2 || fyVar.R2 != 0 || fyVar.T2 != 0) {
                    fyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            ewVar.setIsEditing(false);
            fyVar.I4(false);
        } else if (i10 == 1) {
            if (fyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                fyVar.f38261b0.getLocationInWindow(iArr);
                ((LaunchActivity) fyVar.getParentActivity()).G0(false, true, (fyVar.f38261b0.getMeasuredWidth() / 2) + iArr[0], (fyVar.f38261b0.getMeasuredHeight() / 2) + iArr[1], new ui(this, 24));
                fyVar.getNotificationsController().showNotifications();
                fyVar.y3();
            }
        } else if (i10 == 3) {
            fyVar.O4(true, true, true, false);
            fyVar.U.b(true);
        } else if (i10 == 11) {
            fyVar.p4(fyVar.f38382z1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.j00 j00Var = new org.telegram.ui.Components.j00(arrayList3, fyVar);
            j00Var.f29518r = new xt(this, 4);
            fyVar.showDialog(j00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = fyVar.getMessagesController().getDialogFilters().get(fyVar.f38256a0[0].h);
            ArrayList H = org.telegram.ui.Components.j00.H(fyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (H.size() + i11 > 100) {
                fyVar.showDialog(org.telegram.ui.Components.c5.N(fyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f22714a);
                return;
            }
            if (!H.isEmpty()) {
                dialogFilter2.neverShow.addAll(H);
                for (int i13 = 0; i13 < H.size(); i13++) {
                    Long l10 = (Long) H.get(i13);
                    dialogFilter2.alwaysShow.remove(l10);
                    dialogFilter2.pinnedDialogs.delete(l10.longValue());
                }
                if (dialogFilter2.isChatlist()) {
                    dialogFilter2.neverShow.clear();
                }
                dialogFilter = dialogFilter2;
                arrayList = H;
                i12 = 1;
                p00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, fyVar, null);
            } else {
                arrayList = H;
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
            UndoView Y3 = fyVar.Y3();
            if (Y3 != null) {
                Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            fyVar.b4(z10);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            fyVar.r4(fyVar.E2, i10, true, false, null);
        }
    }
}
