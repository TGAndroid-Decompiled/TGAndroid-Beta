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

public final class hw extends org.telegram.ui.ActionBar.j {

    public final gy f38894a;

    public hw(gy gyVar) {
        this.f38894a = gyVar;
    }

    @Override
    public final void b(int i10) {
        px pxVar;
        MessagesController.DialogFilter dialogFilter;
        int i11;
        ArrayList arrayList;
        boolean z10;
        gy gyVar = this.f38894a;
        ArrayList arrayList2 = gyVar.E2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (pxVar = gyVar.f38619y0) != null) {
            HashMap map = pxVar.f29762v0;
            gy gyVar2 = pxVar.F0;
            if (i10 == 202) {
                if (gyVar2 == null || gyVar2.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList(map.values());
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar2.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("RemoveDocumentsTitle", map.size(), new Object[0]);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", map.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                alertDialog$Builder.f22702a.P = spannableStringBuilder;
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.pc0(8));
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.g1(23, pxVar, arrayList3));
                TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    return;
                }
                return;
            }
            if (i10 == 203) {
                if (pxVar.N()) {
                    gyVar2.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) gyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (map.size() != 1) {
                    return;
                }
                pxVar.c((MessageObject) map.values().iterator().next());
                return;
            } else {
                if (i10 == 201) {
                    gy gyVar3 = new gy(org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true));
                    gyVar3.f38621y2 = new org.telegram.ui.Components.vu(pxVar, 17);
                    gyVar2.presentFragment(gyVar3);
                    return;
                }
                return;
            }
        }
        long jLongValue = 0;
        if (i10 == -1) {
            bx bxVar = gyVar.B3;
            if (bxVar != null && bxVar.c()) {
                if (!((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t()) {
                    gyVar.B3.a();
                    px pxVar2 = gyVar.f38619y0;
                    if (pxVar2 != null) {
                        pxVar2.R();
                        return;
                    }
                    return;
                }
                px pxVar3 = gyVar.f38619y0;
                if (pxVar3 != null && pxVar3.getVisibility() == 0) {
                    px pxVar4 = gyVar.f38619y0;
                    if (pxVar4.f29761u0) {
                        pxVar4.Q(false);
                        return;
                    }
                }
                gyVar.b4(true);
                return;
            }
            fw fwVar = gyVar.f38604v0;
            if (fwVar != null && fwVar.f35085n) {
                fwVar.setIsEditing(false);
                gyVar.I4(false);
                return;
            }
            if (!((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t()) {
                if (!gyVar.f38537h2 && gyVar.R2 == 0 && gyVar.T2 == 0) {
                    return;
                }
                gyVar.finishFragment();
                return;
            }
            px pxVar5 = gyVar.f38619y0;
            if (pxVar5 != null && pxVar5.getVisibility() == 0) {
                px pxVar6 = gyVar.f38619y0;
                if (pxVar6.f29761u0) {
                    pxVar6.Q(false);
                    return;
                }
            }
            gyVar.b4(true);
            return;
        }
        if (i10 == 1) {
            if (gyVar.getParentActivity() == null) {
                return;
            }
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
            int[] iArr = new int[2];
            gyVar.f38502b0.getLocationInWindow(iArr);
            ((LaunchActivity) gyVar.getParentActivity()).G0(false, true, (gyVar.f38502b0.getMeasuredWidth() / 2) + iArr[0], (gyVar.f38502b0.getMeasuredHeight() / 2) + iArr[1], new ti(this, 24));
            gyVar.getNotificationsController().showNotifications();
            gyVar.y3();
            return;
        }
        if (i10 == 3) {
            gyVar.O4(true, true, true, false);
            gyVar.U.b(true);
            return;
        }
        if (i10 == 11) {
            gyVar.p4(gyVar.f38624z1);
            return;
        }
        if (i10 == 109) {
            org.telegram.ui.Components.b00 b00Var = new org.telegram.ui.Components.b00(gyVar, arrayList2);
            b00Var.f26870r = new zt(this, 4);
            gyVar.showDialog(b00Var);
            return;
        }
        if (i10 != 110) {
            if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                gyVar.r4(gyVar.E2, i10, true, false, null);
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter2 = gyVar.getMessagesController().getDialogFilters().get(gyVar.f38498a0[0].h);
        ArrayList arrayListI = org.telegram.ui.Components.b00.I(gyVar, dialogFilter2, arrayList2, false, false);
        if (arrayListI.size() + (dialogFilter2 != null ? dialogFilter2.neverShow.size() : 0) > 100) {
            gyVar.showDialog(org.telegram.ui.Components.y4.N(gyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f22702a);
            return;
        }
        if (arrayListI.isEmpty()) {
            dialogFilter = dialogFilter2;
            i11 = 1;
        } else {
            dialogFilter2.neverShow.addAll(arrayListI);
            for (int i12 = 0; i12 < arrayListI.size(); i12++) {
                Long l10 = (Long) arrayListI.get(i12);
                dialogFilter2.alwaysShow.remove(l10);
                dialogFilter2.pinnedDialogs.delete(l10.longValue());
            }
            if (dialogFilter2.isChatlist()) {
                dialogFilter2.neverShow.clear();
            }
            dialogFilter = dialogFilter2;
            i11 = 1;
            q00.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, gyVar, null);
        }
        if (arrayListI.size() == i11) {
            arrayList = arrayListI;
            z10 = false;
            jLongValue = ((Long) arrayList.get(0)).longValue();
        } else {
            arrayList = arrayListI;
            z10 = false;
        }
        long j10 = jLongValue;
        UndoView undoViewY3 = gyVar.Y3();
        if (undoViewY3 != null) {
            undoViewY3.k(j10, 21, Integer.valueOf(arrayList.size()), dialogFilter, null, null);
        }
        gyVar.b4(z10);
    }
}
