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
public final class ov implements View.OnClickListener {
    public final int f36349a;
    public final Object f36350b;
    public final Object f36351c;

    public ov(int i10, Object obj, Object obj2) {
        this.f36349a = i10;
        this.f36350b = obj;
        this.f36351c = obj2;
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
        switch (this.f36349a) {
            case 0:
                qy qyVar = (qy) this.f36350b;
                qyVar.getClass();
                ((org.telegram.ui.Components.y70) this.f36351c).u();
                qyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.a2[]) this.f36351c, r0, r0.currentAccount, ((qy) this.f36350b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f36350b)[0].getSwipeBack().e(((int[]) this.f36351c)[0]);
                return;
            case 3:
                qy qyVar2 = (qy) this.f36350b;
                qyVar2.r4((ArrayList) this.f36351c, 102, false, false, null);
                qyVar2.finishPreviewFragment();
                return;
            case 4:
                qy.H0((qy) this.f36350b, (BirthdayController.BirthdayState) this.f36351c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tt(2, (qy) this.f36350b, (String) this.f36351c), 250L);
                return;
            case 6:
                z10 z10Var = (z10) this.f36350b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((a20) this.f36351c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f15832id = 2;
                while (z10Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f15832id) != null) {
                    dialogFilter.f15832id++;
                }
                dialogFilter.order = z10Var.e.getMessagesController().getDialogFilters().size();
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
                b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, z10Var.e, new tt(19, z10Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f36350b, ((TL_fragment.TL_collectibleInfo) this.f36351c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.f21) this.f36350b).run();
                ((org.telegram.ui.ActionBar.e3) this.f36351c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f36351c;
                d60 d60Var = ((n30) this.f36350b).E;
                ChatObject.Call call = d60Var.f32936a1;
                if (call != null && call.recording) {
                    d60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new m50((Context) this.f36351c, (n50) this.f36350b).show();
                return;
            case 11:
                y70 y70Var = (y70) this.f36350b;
                org.telegram.ui.Components.lj0 lj0Var = (org.telegram.ui.Components.lj0) this.f36351c;
                y70Var.getClass();
                if (!qy.f37008w4) {
                    qy.f37008w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.h6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.h6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.h6.f19254o = 0;
                    org.telegram.ui.ActionBar.h6.q1();
                    org.telegram.ui.ActionBar.h6.A();
                    org.telegram.ui.Components.ij0 ij0Var = y70Var.v;
                    if (!q6) {
                        i10 = ij0Var.e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    ij0Var.P(i10);
                    lj0Var.d();
                    lj0Var.getLocationInWindow(r0);
                    int[] iArr = {(lj0Var.getMeasuredWidth() / 2) + iArr[0], (lj0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), lj0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    lj0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                k80 k80Var = (k80) this.f36350b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f36351c;
                k80Var.Q.dismiss();
                if (k80Var.f34977f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = k80Var.f34974c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    qy qyVar3 = new qy(bundle);
                    qyVar3.C2 = new ow(6, k80Var, qyVar3);
                    m2Var.presentFragment(qyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", k80Var.f34974c0);
                a6 a6Var = new a6(bundle2);
                a6Var.d = k80Var.f34977f0;
                a6Var.U();
                m2Var.presentFragment(a6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f36351c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f36350b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f20837a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.f36351c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new hb0((rb0) this.f36350b, 0));
                return;
            case 15:
                rb0 rb0Var = (rb0) this.f36350b;
                Runnable[] runnableArr = (Runnable[]) this.f36351c;
                if (rb0Var.e == null) {
                    ob0 ob0Var = rb0Var.f37285f;
                    if (ob0Var.e.h) {
                        int i24 = -rb0Var.N;
                        rb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(ob0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.e;
                    w8Var.setChecked(!r42.h);
                    pb0 pb0Var = rb0Var.f37287r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    pb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        rb0Var.f37285f.setChecked(false);
                        rb0Var.f37285f.setCheckBoxIcon(R.drawable.permission_locked);
                        rb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        gb0 gb0Var = new gb0(rb0Var, 0);
                        runnableArr[0] = gb0Var;
                        AndroidUtilities.runOnUIThread(gb0Var, 60L);
                        return;
                    }
                    rb0Var.f37285f.setCheckBoxIcon(0);
                    rb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    gb0 gb0Var2 = new gb0(rb0Var, 1);
                    runnableArr[0] = gb0Var2;
                    AndroidUtilities.runOnUIThread(gb0Var2);
                    return;
                }
                return;
            case 16:
                cd0 cd0Var = (cd0) this.f36350b;
                cd0Var.r0((wc0) this.f36351c);
                uc0 uc0Var = cd0Var.I0;
                if (uc0Var != null) {
                    uc0Var.dismiss();
                    return;
                }
                return;
            case 17:
                cd0 cd0Var2 = ((zc0) this.f36350b).f40446b;
                cd0Var2.getClass();
                cd0Var2.F0.b(((bd0) this.f36351c).f32393c, cd0Var2.G0, true, 0, 0L);
                cd0Var2.finishFragment();
                return;
            case 18:
                ae0 ae0Var = (ae0) this.f36350b;
                Context context = (Context) this.f36351c;
                String string = ae0Var.f32147y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f22849a |= 256;
                    obj.f22850b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f22851c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.c11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = ae0Var.G;
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
                alertDialog$Builder.f18662a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new du(ae0Var, 17));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                je0 je0Var = (je0) this.f36350b;
                Context context2 = (Context) this.f36351c;
                qg0 qg0Var = je0Var.f34788y;
                if (qg0Var.V.getTag() == null) {
                    if (je0Var.f34783n.has_recovery) {
                        qg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new he0(je0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(je0Var.f34779a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f18662a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f18662a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new du(je0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                tf0 tf0Var = (tf0) this.f36350b;
                Context context3 = (Context) this.f36351c;
                Bundle bundle3 = tf0Var.f38093o0;
                if (bundle3 != null && (tL_auth_sentCode = tf0Var.f38094p0) != null) {
                    tf0Var.f38099s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!tf0Var.f38081d0) {
                    rf0 rf0Var = tf0Var.v;
                    if ((rf0Var == null || rf0Var.getVisibility() == 8) && !tf0Var.f38087i0) {
                        if (tf0Var.f38085g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = tf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = tf0Var.f38079c;
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
                            tf0Var.f38099s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f18662a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f18662a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, tf0Var.f38077b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new ow(20, tf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new if0(tf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (tf0Var.f38099s0.V.getTag() == null) {
                            tf0Var.x();
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
                pg0 pg0Var = (pg0) this.f36350b;
                Context context4 = (Context) this.f36351c;
                Toast toast = pg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    pg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (pg0Var.M > 0 && currentTimeMillis - pg0Var.N > 1500) {
                    pg0Var.M = 0;
                }
                int i31 = pg0Var.M + 1;
                pg0Var.M = i31;
                pg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    pg0Var.M = 0;
                    pg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(pg0Var.getContext());
                    alertDialog$Builder4.f18662a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new qv(pg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    pg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f36351c;
                dj0 dj0Var = ((bj0) this.f36350b).d;
                if (!dj0Var.a0(messageObject)) {
                    dj0Var.getOrCreateStoryViewer().F(dj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(dj0Var.f33141f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36350b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f36351c;
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
                ImageView imageView = passcodeActivity.f31177s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.h6.f19205l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.h6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                return;
            case 24:
                oo0.h0((oo0) this.f36350b, (String) this.f36351c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f36350b;
                org.telegram.ui.Components.y70 y70Var2 = (org.telegram.ui.Components.y70) this.f36351c;
                if (photoViewer.T4 != null) {
                    y70Var2.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.f31295m4;
                    if (m2Var2 instanceof wn) {
                        ((wn) m2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f36350b;
                Activity activity = (Activity) this.f36351c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.f31335r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f31248g7.size()) {
                        Object obj2 = photoViewer2.f31248g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31269j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.e4 e4Var = photoViewer2.f31277k1;
                                if (e4Var != null) {
                                    e4Var.e(true);
                                    photoViewer2.f31277k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f31277k1 = new ci.e4(photoViewer2.E, 3);
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
                                    photoViewer2.f31277k1.s(append);
                                    photoViewer2.f31224e0.addView(photoViewer2.f31277k1, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f31277k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f31277k1.m(0.0f, (photoViewer2.f31269j1.getWidth() / 2.0f) + photoViewer2.f31269j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.f31277k1;
                                    e4Var2.f4615l0 = new kh(2, e4Var2);
                                    e4Var2.d = 3500L;
                                    e4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31269j1.getTag() == null) {
                        if (photoViewer2.f31284k8) {
                            if (photoViewer2.f31292m1 == null) {
                                nu0 nu0Var = photoViewer2.f31224e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.wq0(textView2, 18);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                nu0Var.addView((View) textView2, w7.y5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f31292m1 = textView2;
                            }
                            photoViewer2.f31292m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.l21 l21Var = photoViewer2.f31292m1;
                            org.telegram.ui.Components.f71 f71Var = photoViewer2.f31269j1;
                            org.telegram.ui.Components.wq0 wq0Var = l21Var.d;
                            if (f71Var != null) {
                                l21Var.f26012a = f71Var;
                                l21Var.a();
                                l21Var.f26014c = true;
                                AndroidUtilities.cancelRunOnUIThread(wq0Var);
                                AndroidUtilities.runOnUIThread(wq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = l21Var.f26013b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    l21Var.f26013b.cancel();
                                    l21Var.f26013b = null;
                                }
                                if (l21Var.getVisibility() != 0) {
                                    l21Var.setAlpha(0.0f);
                                    l21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = l21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    l21Var.f26013b = listener;
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
                ((org.telegram.ui.Components.y70) this.f36351c).K((org.telegram.ui.Components.y70) this.f36350b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36350b;
                ((AlertDialog$Builder) this.f36351c).f18662a.L0.run();
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
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(privacySettingsActivity.getParentActivity(), 3, null);
                a2Var.f18683g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new fs0(privacySettingsActivity, a2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f36350b;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f36351c).url);
                return;
        }
    }

    public ov(org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.f36349a = 27;
        this.f36351c = y70Var;
        this.f36350b = y70Var2;
    }
}
