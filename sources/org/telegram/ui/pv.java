package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class pv implements View.OnClickListener {
    public final int f36211a;
    public final Object f36212b;
    public final Object f36213c;

    public pv(int i10, Object obj, Object obj2) {
        this.f36211a = i10;
        this.f36212b = obj;
        this.f36213c = obj2;
    }

    @Override
    public final void onClick(View view) {
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList<Long> arrayList2;
        org.telegram.ui.ActionBar.g6 N0;
        int i10;
        int i11;
        boolean z10;
        String formatString;
        int i12;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j3 = 0;
        int i19 = 8;
        switch (this.f36211a) {
            case 0:
                ry ryVar = (ry) this.f36212b;
                ryVar.getClass();
                ((org.telegram.ui.Components.o70) this.f36213c).u();
                ryVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.f36213c, r0, r0.currentAccount, ((ry) this.f36212b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f36212b)[0].getSwipeBack().e(((int[]) this.f36213c)[0]);
                return;
            case 3:
                ry ryVar2 = (ry) this.f36212b;
                ryVar2.r4((ArrayList) this.f36213c, 102, false, false, null);
                ryVar2.finishPreviewFragment();
                return;
            case 4:
                ry.H0((ry) this.f36212b, (BirthdayController.BirthdayState) this.f36213c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ar0(27, (ry) this.f36212b, (String) this.f36213c), 250L);
                return;
            case 6:
                b20 b20Var = (b20) this.f36212b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((c20) this.f36213c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f15577id = 2;
                while (b20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f15577id) != null) {
                    dialogFilter.f15577id++;
                }
                dialogFilter.order = b20Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                for (int i20 = 0; i20 < 2; i20++) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    if (i20 == 0) {
                        arrayList = dialogFilter2.include_peers;
                    } else {
                        arrayList = dialogFilter2.exclude_peers;
                    }
                    if (i20 == 0) {
                        arrayList2 = dialogFilter.alwaysShow;
                    } else {
                        arrayList2 = dialogFilter.neverShow;
                    }
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i21);
                        long j10 = j3;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i21 = com.google.android.gms.internal.vision.e2.g(j11, arrayList2, i21, 1);
                        j3 = j10;
                    }
                }
                TLRPC.DialogFilter dialogFilter3 = suggestedFilter.filter;
                if (dialogFilter3.groups) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                }
                if (dialogFilter3.bots) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_BOTS;
                }
                if (dialogFilter3.contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                }
                if (dialogFilter3.non_contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                }
                if (dialogFilter3.broadcasts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                }
                if (dialogFilter3.exclude_archived) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                }
                if (dialogFilter3.exclude_read) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                }
                if (dialogFilter3.exclude_muted) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                }
                c10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, b20Var.e, new hw(14, b20Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f36212b, ((TL_fragment.TL_collectibleInfo) this.f36213c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.r11) this.f36212b).run();
                ((org.telegram.ui.ActionBar.f3) this.f36213c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f36213c;
                f60 f60Var = ((p30) this.f36212b).E;
                ChatObject.Call call = f60Var.f33099a1;
                if (call != null && call.recording) {
                    f60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new o50((Context) this.f36213c, (p50) this.f36212b).show();
                return;
            case 11:
                a80 a80Var = (a80) this.f36212b;
                org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) this.f36213c;
                a80Var.getClass();
                if (!ry.f36952w4) {
                    ry.f36952w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.h6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.h6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.h6.f18983o = 0;
                    org.telegram.ui.ActionBar.h6.q1();
                    org.telegram.ui.ActionBar.h6.A();
                    org.telegram.ui.Components.yi0 yi0Var = a80Var.v;
                    if (!q6) {
                        i10 = yi0Var.e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    yi0Var.P(i10);
                    bj0Var.d();
                    bj0Var.getLocationInWindow(r0);
                    int[] iArr = {(bj0Var.getMeasuredWidth() / 2) + iArr[0], (bj0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), bj0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    bj0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                m80 m80Var = (m80) this.f36212b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f36213c;
                m80Var.Q.dismiss();
                if (m80Var.f35178f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = m80Var.f35175c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ry ryVar3 = new ry(bundle);
                    ryVar3.C2 = new w10(5, m80Var, ryVar3);
                    n2Var.presentFragment(ryVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", m80Var.f35175c0);
                b6 b6Var = new b6(bundle2);
                b6Var.d = m80Var.f35178f0;
                b6Var.U();
                n2Var.presentFragment(b6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f36213c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f36212b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f20593a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.f36213c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ib0((sb0) this.f36212b, 0));
                return;
            case 15:
                sb0 sb0Var = (sb0) this.f36212b;
                Runnable[] runnableArr = (Runnable[]) this.f36213c;
                if (sb0Var.e == null) {
                    pb0 pb0Var = sb0Var.f37229f;
                    if (pb0Var.e.h) {
                        int i24 = -sb0Var.N;
                        sb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(pb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    Switch r42 = x8Var.e;
                    x8Var.setChecked(!r42.h);
                    qb0 qb0Var = sb0Var.f37231r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    qb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        sb0Var.f37229f.setChecked(false);
                        sb0Var.f37229f.setCheckBoxIcon(R.drawable.permission_locked);
                        sb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        hb0 hb0Var = new hb0(sb0Var, 0);
                        runnableArr[0] = hb0Var;
                        AndroidUtilities.runOnUIThread(hb0Var, 60L);
                        return;
                    }
                    sb0Var.f37229f.setCheckBoxIcon(0);
                    sb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    hb0 hb0Var2 = new hb0(sb0Var, 1);
                    runnableArr[0] = hb0Var2;
                    AndroidUtilities.runOnUIThread(hb0Var2);
                    return;
                }
                return;
            case 16:
                dd0 dd0Var = (dd0) this.f36212b;
                dd0Var.r0((xc0) this.f36213c);
                vc0 vc0Var = dd0Var.I0;
                if (vc0Var != null) {
                    vc0Var.dismiss();
                    return;
                }
                return;
            case 17:
                dd0 dd0Var2 = ((ad0) this.f36212b).f31773b;
                dd0Var2.getClass();
                dd0Var2.F0.b(((cd0) this.f36213c).f32315c, dd0Var2.G0, true, 0, 0L);
                dd0Var2.finishFragment();
                return;
            case 18:
                be0 be0Var = (be0) this.f36212b;
                Context context = (Context) this.f36213c;
                String string = be0Var.f32096y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f26312a |= 256;
                    obj.f26313b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f26314c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o01(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = be0Var.G;
                int i27 = i26 / 86400;
                int i28 = i26 % 86400;
                int i29 = i28 / 3600;
                int i30 = (i28 % 3600) / 60;
                if (i27 == 0 && i29 == 0) {
                    i30 = Math.max(1, i30);
                }
                if (i27 != 0 && i29 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i27, new Object[0]), LocaleController.formatPluralString("Hours", i29, new Object[0]));
                } else if (i29 != 0 && i30 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i29, new Object[0]), LocaleController.formatPluralString("Minutes", i30, new Object[0]));
                } else if (i27 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i27, new Object[0]));
                } else if (i29 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]));
                } else {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i30, new Object[0]));
                }
                alertDialog$Builder.f18409a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new eu(be0Var, 17));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                ke0 ke0Var = (ke0) this.f36212b;
                Context context2 = (Context) this.f36213c;
                rg0 rg0Var = ke0Var.f34697y;
                if (rg0Var.V.getTag() == null) {
                    if (ke0Var.f34692n.has_recovery) {
                        rg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new ie0(ke0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(ke0Var.f34688a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new eu(ke0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                uf0 uf0Var = (uf0) this.f36212b;
                Context context3 = (Context) this.f36213c;
                Bundle bundle3 = uf0Var.f38087o0;
                if (bundle3 != null && (tL_auth_sentCode = uf0Var.f38088p0) != null) {
                    uf0Var.f38093s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!uf0Var.f38075d0) {
                    sf0 sf0Var = uf0Var.v;
                    if ((sf0Var == null || sf0Var.getVisibility() == 8) && !uf0Var.f38081i0) {
                        if (uf0Var.f38079g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = uf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = uf0Var.f38073c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            uf0Var.f38093s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f18409a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f18409a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, uf0Var.f38071b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new w10(19, uf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new jf0(uf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (uf0Var.f38093s0.V.getTag() == null) {
                            uf0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                qg0 qg0Var = (qg0) this.f36212b;
                Context context4 = (Context) this.f36213c;
                Toast toast = qg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    qg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (qg0Var.M > 0 && currentTimeMillis - qg0Var.N > 1500) {
                    qg0Var.M = 0;
                }
                int i31 = qg0Var.M + 1;
                qg0Var.M = i31;
                qg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    qg0Var.M = 0;
                    qg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qg0Var.getContext());
                    alertDialog$Builder4.f18409a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new rv(qg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    qg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f36213c;
                ej0 ej0Var = ((cj0) this.f36212b).d;
                if (!ej0Var.a0(messageObject)) {
                    ej0Var.getOrCreateStoryViewer().F(ej0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(ej0Var.f32952f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36212b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f36213c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i14 = 144;
                } else {
                    i14 = 128;
                }
                editTextBoldCursor.setInputType(i14 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f30861s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.h6.f18934l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.h6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                return;
            case 24:
                qo0.h0((qo0) this.f36212b, (String) this.f36213c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f36212b;
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.f36213c;
                if (photoViewer.T4 != null) {
                    o70Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.f30979m4;
                    if (n2Var2 instanceof xn) {
                        ((xn) n2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f36212b;
                Activity activity = (Activity) this.f36213c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.f31019r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f30932g7.size()) {
                        Object obj2 = photoViewer2.f30932g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f30953j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.e4 e4Var = photoViewer2.f30961k1;
                                if (e4Var != null) {
                                    e4Var.e(true);
                                    photoViewer2.f30961k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f30961k1 = new ci.e4(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i16 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i16 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) LocaleController.getString(i16));
                                    if (isHighQuality) {
                                        i17 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i17 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.pq(i17, 0), 0, 1, 33);
                                    photoViewer2.f30961k1.s(append);
                                    photoViewer2.f30908e0.addView(photoViewer2.f30961k1, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f30961k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f30961k1.m(0.0f, (photoViewer2.f30953j1.getWidth() / 2.0f) + photoViewer2.f30953j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.f30961k1;
                                    e4Var2.f4615l0 = new gh(2, e4Var2);
                                    e4Var2.d = 3500L;
                                    e4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f30953j1.getTag() == null) {
                        if (photoViewer2.f30968k8) {
                            if (photoViewer2.f30976m1 == null) {
                                ou0 ou0Var = photoViewer2.f30908e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.jq0(textView2, 17);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                ou0Var.addView((View) textView2, w7.x5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f30976m1 = textView2;
                            }
                            photoViewer2.f30976m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.x11 x11Var = photoViewer2.f30976m1;
                            org.telegram.ui.Components.r61 r61Var = photoViewer2.f30953j1;
                            org.telegram.ui.Components.jq0 jq0Var = x11Var.d;
                            if (r61Var != null) {
                                x11Var.f29870a = r61Var;
                                x11Var.a();
                                x11Var.f29872c = true;
                                AndroidUtilities.cancelRunOnUIThread(jq0Var);
                                AndroidUtilities.runOnUIThread(jq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = x11Var.f29871b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    x11Var.f29871b.cancel();
                                    x11Var.f29871b = null;
                                }
                                if (x11Var.getVisibility() != 0) {
                                    x11Var.setAlpha(0.0f);
                                    x11Var.setVisibility(0);
                                    ViewPropertyAnimator listener = x11Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    x11Var.f29871b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.X2(true);
                    photoViewer2.o2(1);
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.o70) this.f36213c).K((org.telegram.ui.Components.o70) this.f36212b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36212b;
                ((AlertDialog$Builder) this.f36213c).f18409a.L0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i18 = 30;
                } else if (num2.intValue() == 1) {
                    i18 = 90;
                } else if (num2.intValue() == 2) {
                    i18 = 182;
                } else if (num2.intValue() == 3) {
                    i18 = 365;
                } else if (num2.intValue() == 4) {
                    i18 = 548;
                } else if (num2.intValue() == 5) {
                    i18 = 730;
                } else {
                    i18 = 0;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.f18459g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new gs0(privacySettingsActivity, b2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f36212b;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f36213c).url);
                return;
        }
    }

    public pv(org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.f36211a = 27;
        this.f36213c = o70Var;
        this.f36212b = o70Var2;
    }
}
