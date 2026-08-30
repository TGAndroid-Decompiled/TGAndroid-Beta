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
public final class pw extends org.telegram.ui.ActionBar.j {
    public final oy f37544a;

    public pw(oy oyVar) {
        this.f37544a = oyVar;
    }

    @Override
    public final void b(int i10) {
        xx xxVar;
        int i11;
        ArrayList arrayList;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        ArrayList arrayList2;
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        oy oyVar = this.f37544a;
        ArrayList arrayList3 = oyVar.F2;
        if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (xxVar = oyVar.f37129z0) != null) {
            HashMap hashMap = xxVar.f24338w0;
            oy oyVar2 = xxVar.G0;
            if (i10 == 202) {
                if (oyVar2 != null && oyVar2.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList(hashMap.values());
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar2.getParentActivity());
                    alertDialog$Builder.f19503a.O = LocaleController.formatPluralString("RemoveDocumentsTitle", hashMap.size(), new Object[0]);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", hashMap.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
                    alertDialog$Builder.f19503a.Q = spannableStringBuilder;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.kh0(2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.o1(22, xxVar, arrayList4));
                    TextView textView = (TextView) alertDialog$Builder.o().d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == 203) {
                if (xxVar.N()) {
                    oyVar2.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) oyVar2, 2, true));
                    return;
                }
                return;
            } else if (i10 == 200) {
                if (hashMap.size() == 1) {
                    xxVar.c((MessageObject) hashMap.values().iterator().next());
                    return;
                }
                return;
            } else if (i10 == 201) {
                oy oyVar3 = new oy(org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true));
                oyVar3.f37131z2 = new org.telegram.ui.Components.fv(xxVar, 17);
                oyVar2.presentFragment(oyVar3);
                return;
            } else {
                return;
            }
        }
        long j10 = 0;
        if (i10 == -1) {
            jx jxVar = oyVar.C3;
            if (jxVar != null && jxVar.c()) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (kVar2.s()) {
                    xx xxVar2 = oyVar.f37129z0;
                    if (xxVar2 != null && xxVar2.getVisibility() == 0) {
                        xx xxVar3 = oyVar.f37129z0;
                        if (xxVar3.f24337v0) {
                            xxVar3.Q(false);
                            return;
                        }
                    }
                    oyVar.b4(true);
                    return;
                }
                oyVar.C3.a();
                xx xxVar4 = oyVar.f37129z0;
                if (xxVar4 != null) {
                    xxVar4.R();
                    return;
                }
                return;
            }
            nw nwVar = oyVar.f37115w0;
            if (nwVar == null || !nwVar.f25830n) {
                kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (kVar.s()) {
                    xx xxVar5 = oyVar.f37129z0;
                    if (xxVar5 != null && xxVar5.getVisibility() == 0) {
                        xx xxVar6 = oyVar.f37129z0;
                        if (xxVar6.f24337v0) {
                            xxVar6.Q(false);
                            return;
                        }
                    }
                    oyVar.b4(true);
                    return;
                } else if (oyVar.f37047i2 || oyVar.S2 != 0 || oyVar.U2 != 0) {
                    oyVar.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            nwVar.setIsEditing(false);
            oyVar.I4(false);
        } else if (i10 == 1) {
            if (oyVar.getParentActivity() != null) {
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                oyVar.f37015c0.getLocationInWindow(iArr);
                ((LaunchActivity) oyVar.getParentActivity()).G0(false, true, (oyVar.f37015c0.getMeasuredWidth() / 2) + iArr[0], (oyVar.f37015c0.getMeasuredHeight() / 2) + iArr[1], new zi(this, 24));
                oyVar.getNotificationsController().showNotifications();
                oyVar.y3();
            }
        } else if (i10 == 3) {
            oyVar.O4(true, true, true, false);
            oyVar.V.b(true);
        } else if (i10 == 11) {
            oyVar.p4(oyVar.A1);
        } else if (i10 == 109) {
            org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(arrayList3, oyVar);
            n00Var.f27152r = new fu(this, 4);
            oyVar.showDialog(n00Var);
        } else if (i10 == 110) {
            MessagesController.DialogFilter dialogFilter2 = oyVar.getMessagesController().getDialogFilters().get(oyVar.f37009b0[0].h);
            ArrayList H = org.telegram.ui.Components.n00.H(oyVar, dialogFilter2, arrayList3, false, false);
            if (dialogFilter2 != null) {
                i11 = dialogFilter2.neverShow.size();
            } else {
                i11 = 0;
            }
            if (H.size() + i11 > 100) {
                oyVar.showDialog(org.telegram.ui.Components.z4.N(oyVar.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).f19503a);
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
                b10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, false, false, oyVar, null);
            } else {
                arrayList = H;
                dialogFilter = dialogFilter2;
                i12 = 1;
            }
            if (arrayList.size() == i12) {
                arrayList2 = arrayList;
                z4 = false;
                j10 = ((Long) arrayList2.get(0)).longValue();
            } else {
                arrayList2 = arrayList;
                z4 = false;
            }
            long j11 = j10;
            UndoView Y3 = oyVar.Y3();
            if (Y3 != null) {
                Y3.k(j11, 21, Integer.valueOf(arrayList2.size()), dialogFilter, null, null);
            }
            oyVar.b4(z4);
        } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
            oyVar.r4(oyVar.F2, i10, true, false, null);
        }
    }
}
