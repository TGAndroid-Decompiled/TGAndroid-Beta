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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
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
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class ow implements View.OnClickListener {
    public final int f35620a;
    public final Object f35621b;
    public final Object f35622c;

    public ow(int i10, Object obj, Object obj2) {
        this.f35620a = i10;
        this.f35621b = obj;
        this.f35622c = obj2;
    }

    private final void a(View view) {
        String str;
        u21 u21Var = (u21) this.f35621b;
        Context context = (Context) this.f35622c;
        StringBuilder sb2 = new StringBuilder();
        String obj = u21Var.f37089a[0].getText().toString();
        String obj2 = u21Var.f37089a[3].getText().toString();
        String obj3 = u21Var.f37089a[2].getText().toString();
        String obj4 = u21Var.f37089a[1].getText().toString();
        String obj5 = u21Var.f37089a[4].getText().toString();
        try {
            if (!TextUtils.isEmpty(obj)) {
                sb2.append("server=");
                sb2.append(URLEncoder.encode(obj, "UTF-8"));
            }
            if (!TextUtils.isEmpty(obj4)) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append("port=");
                sb2.append(URLEncoder.encode(obj4, "UTF-8"));
            }
            if (u21Var.v == 2) {
                str = "https://t.me/proxy?";
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append("secret=");
                sb2.append(URLEncoder.encode(obj5, "UTF-8"));
            } else {
                str = "https://t.me/socks?";
                if (!TextUtils.isEmpty(obj3)) {
                    if (sb2.length() != 0) {
                        sb2.append("&");
                    }
                    sb2.append("user=");
                    sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(obj2)) {
                    if (sb2.length() != 0) {
                        sb2.append("&");
                    }
                    sb2.append("pass=");
                    sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                }
            }
            if (sb2.length() != 0) {
                StringBuilder u10 = a4.a.u(str);
                u10.append(sb2.toString());
                org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                ti0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                u21Var.showDialog(ti0Var);
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void onClick(View view) {
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList<Long> arrayList2;
        long j3;
        org.telegram.ui.ActionBar.i6 N0;
        int i10;
        boolean z10;
        char c10;
        char c11;
        String formatString;
        int i11;
        int i12;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        a61 a61Var;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.c3 c3Var = null;
        switch (this.f35620a) {
            case 0:
                wy wyVar = (wy) this.f35621b;
                wyVar.r4((ArrayList) this.f35622c, 102, false, false, null);
                wyVar.finishPreviewFragment();
                return;
            case 1:
                wy.H0((wy) this.f35621b, (BirthdayController.BirthdayState) this.f35622c);
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new uv(0, (wy) this.f35621b, (String) this.f35622c), 250L);
                return;
            case 3:
                f20 f20Var = (f20) this.f35621b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((g20) this.f35622c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f14645id = 2;
                while (f20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f14645id) != null) {
                    dialogFilter.f14645id++;
                }
                dialogFilter.order = f20Var.e.getMessagesController().getDialogFilters().size();
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
                    for (int i21 = 0; i21 < size; i21 = com.google.android.gms.internal.vision.e2.f(j3, arrayList2, i21, 1)) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i21);
                        j3 = inputPeer.user_id;
                        if (j3 == 0) {
                            long j10 = inputPeer.chat_id;
                            if (j10 == 0) {
                                j10 = inputPeer.channel_id;
                            }
                            j3 = -j10;
                        }
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
                h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, f20Var.e, new uv(17, f20Var, suggestedFilter));
                return;
            case 4:
                nf.f.s((Context) this.f35621b, ((TL_fragment.TL_collectibleInfo) this.f35622c).url);
                return;
            case 5:
                ((org.telegram.ui.Components.g21) this.f35621b).run();
                ((org.telegram.ui.ActionBar.h3) this.f35622c).dismiss();
                return;
            case 6:
                TextView textView = (TextView) this.f35622c;
                j60 j60Var = ((t30) this.f35621b).E;
                ChatObject.Call call = j60Var.f33936a1;
                if (call != null && call.recording) {
                    j60Var.G1(textView);
                    return;
                }
                return;
            case 7:
                new s50((Context) this.f35622c, (t50) this.f35621b).show();
                return;
            case 8:
                c80 c80Var = (c80) this.f35621b;
                org.telegram.ui.Components.kj0 kj0Var = (org.telegram.ui.Components.kj0) this.f35622c;
                c80Var.getClass();
                if (!wy.f38406x4) {
                    wy.f38406x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.j6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.j6.f18119o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    org.telegram.ui.Components.hj0 hj0Var = c80Var.v;
                    hj0Var.P(!q6 ? hj0Var.e[0] - 1 : 0);
                    kj0Var.d();
                    kj0Var.getLocationInWindow(r0);
                    int[] iArr = {(kj0Var.getMeasuredWidth() / 2) + iArr[0], (kj0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), kj0Var);
                    if (!q6) {
                        i10 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i10 = R.string.AccDescrSwitchToNightTheme;
                    }
                    kj0Var.setContentDescription(LocaleController.getString(i10));
                    return;
                }
                return;
            case 9:
                p80 p80Var = (p80) this.f35621b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f35622c;
                p80Var.Q.dismiss();
                if (p80Var.f35704f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = p80Var.f35701c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    wy wyVar2 = new wy(bundle);
                    wyVar2.C2 = new l80(0, p80Var, wyVar2);
                    p2Var.presentFragment(wyVar2);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", p80Var.f35701c0);
                b6 b6Var = new b6(bundle2);
                b6Var.d = p80Var.f35704f0;
                b6Var.U();
                p2Var.presentFragment(b6Var);
                return;
            case 10:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f35622c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f35621b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f19712a.a(z10, true);
                }
                return;
            case 11:
                org.telegram.ui.Components.d5.y((Context) this.f35622c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new nb0((xb0) this.f35621b, 0));
                return;
            case 12:
                int i24 = 8;
                xb0 xb0Var = (xb0) this.f35621b;
                Runnable[] runnableArr = (Runnable[]) this.f35622c;
                if (xb0Var.e == null) {
                    ub0 ub0Var = xb0Var.f38664f;
                    if (ub0Var.e.h) {
                        int i25 = -xb0Var.N;
                        xb0Var.N = i25;
                        AndroidUtilities.shakeViewSpring(ub0Var, i25);
                        return;
                    }
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    Switch r42 = x8Var.e;
                    x8Var.setChecked(!r42.h);
                    vb0 vb0Var = xb0Var.f38666r;
                    if (r42.h) {
                        i24 = 0;
                    }
                    vb0Var.setVisibility(i24);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        xb0Var.f38664f.setChecked(false);
                        xb0Var.f38664f.setCheckBoxIcon(R.drawable.permission_locked);
                        xb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        mb0 mb0Var = new mb0(xb0Var, 0);
                        runnableArr[0] = mb0Var;
                        AndroidUtilities.runOnUIThread(mb0Var, 60L);
                        return;
                    }
                    xb0Var.f38664f.setCheckBoxIcon(0);
                    xb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    mb0 mb0Var2 = new mb0(xb0Var, 1);
                    runnableArr[0] = mb0Var2;
                    AndroidUtilities.runOnUIThread(mb0Var2);
                    return;
                }
                return;
            case 13:
                id0 id0Var = (id0) this.f35621b;
                id0Var.r0((cd0) this.f35622c);
                ad0 ad0Var = id0Var.I0;
                if (ad0Var != null) {
                    ad0Var.dismiss();
                    return;
                }
                return;
            case 14:
                id0 id0Var2 = ((fd0) this.f35621b).f32786b;
                id0Var2.getClass();
                id0Var2.F0.b(((hd0) this.f35622c).f33351c, id0Var2.G0, true, 0, 0L);
                id0Var2.finishFragment();
                return;
            case 15:
                ge0 ge0Var = (ge0) this.f35621b;
                Context context = (Context) this.f35622c;
                String string = ge0Var.f33079y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f21677a |= 256;
                    obj.f21678b = indexOf;
                    int i26 = lastIndexOf + 1;
                    obj.f21679c = i26;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.c11(obj, 0), indexOf, i26, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i27 = ge0Var.G;
                int i28 = i27 / 86400;
                int i29 = i27 % 86400;
                int i30 = i29 / 3600;
                int i31 = (i29 % 3600) / 60;
                if (i28 == 0 && i30 == 0) {
                    i31 = Math.max(1, i31);
                }
                if (i28 != 0 && i30 != 0) {
                    c10 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i28, new Object[0]), LocaleController.formatPluralString("Hours", i30, new Object[0]));
                    i11 = 2;
                    c11 = 1;
                } else {
                    c10 = 0;
                    if (i30 != 0 && i31 != 0) {
                        c11 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i30, new Object[0]), LocaleController.formatPluralString("Minutes", i31, new Object[0]));
                    } else {
                        c11 = 1;
                        if (i28 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i28, new Object[0]));
                        } else if (i30 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i28, new Object[0]));
                        } else {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i31, new Object[0]));
                        }
                    }
                    i11 = 2;
                }
                CharSequence[] charSequenceArr = new CharSequence[i11];
                charSequenceArr[c10] = spannableStringBuilder;
                charSequenceArr[c11] = formatString;
                alertDialog$Builder.f17528a.T = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new iu(ge0Var, 17));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 16:
                pe0 pe0Var = (pe0) this.f35621b;
                Context context2 = (Context) this.f35622c;
                xg0 xg0Var = pe0Var.f35807y;
                if (xg0Var.V.getTag() == null) {
                    if (pe0Var.f35802n.has_recovery) {
                        xg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new ne0(pe0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(pe0Var.f35798a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new iu(pe0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 17:
                zf0 zf0Var = (zf0) this.f35621b;
                Context context3 = (Context) this.f35622c;
                Bundle bundle3 = zf0Var.f39299o0;
                if (bundle3 != null && (tL_auth_sentCode = zf0Var.f39300p0) != null) {
                    zf0Var.f39305s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!zf0Var.f39287d0) {
                    xf0 xf0Var = zf0Var.v;
                    if ((xf0Var == null || xf0Var.getVisibility() == 8) && !zf0Var.f39293i0) {
                        if (zf0Var.f39291g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = zf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = zf0Var.f39285c;
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
                            zf0Var.f39305s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f17528a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f17528a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, zf0Var.f39283b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new l80(14, zf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new of0(zf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (zf0Var.f39305s0.V.getTag() == null) {
                            zf0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 18:
                wg0 wg0Var = (wg0) this.f35621b;
                Context context4 = (Context) this.f35622c;
                Toast toast = wg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    wg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (wg0Var.M > 0 && currentTimeMillis - wg0Var.N > 1500) {
                    i13 = 0;
                    wg0Var.M = 0;
                } else {
                    i13 = 0;
                }
                int i32 = wg0Var.M + 1;
                wg0Var.M = i32;
                wg0Var.N = currentTimeMillis;
                if (i32 >= 5) {
                    wg0Var.M = i13;
                    wg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wg0Var.getContext());
                    alertDialog$Builder4.f17528a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i14 = R.string.DebugMenuDisableLogs;
                    } else {
                        i14 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i14), LocaleController.getString(R.string.DebugSendLogs)}, new wv(wg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i32 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i32, new Object[0]), 0);
                    wg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 19:
                MessageObject messageObject = (MessageObject) this.f35622c;
                kj0 kj0Var2 = ((ij0) this.f35621b).d;
                if (!kj0Var2.a0(messageObject)) {
                    kj0Var2.getOrCreateStoryViewer().G(kj0Var2.getParentActivity(), messageObject.storyItem, zh.s5.a(kj0Var2.f34392f));
                    return;
                }
                return;
            case 20:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35621b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f35622c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i15 = 144;
                } else {
                    i15 = 128;
                }
                editTextBoldCursor.setInputType(i15 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f30003s;
                if (atomicBoolean.get()) {
                    i16 = org.telegram.ui.ActionBar.j6.f18073l6;
                } else {
                    i16 = org.telegram.ui.ActionBar.j6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                return;
            case 21:
                wo0.h0((wo0) this.f35621b, (String) this.f35622c, view);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f35621b;
                org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) this.f35622c;
                if (photoViewer.T4 != null) {
                    w70Var.u();
                    org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer.f30120m4;
                    if (p2Var2 instanceof eo) {
                        ((eo) p2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f35621b;
                Activity activity = (Activity) this.f35622c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (!photoViewer2.H1() && !photoViewer2.f30160r) {
                    int i33 = photoViewer2.P4;
                    if (i33 >= 0 && i33 < photoViewer2.f30073g7.size()) {
                        Object obj2 = photoViewer2.f30073g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f30094j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                bi.x4 x4Var = photoViewer2.f30102k1;
                                if (x4Var != null) {
                                    x4Var.e(true);
                                    photoViewer2.f30102k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f30102k1 = new bi.x4(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i17 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i17 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) LocaleController.getString(i17));
                                    if (isHighQuality) {
                                        i18 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i18 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.uq(i18, 0), 0, 1, 33);
                                    photoViewer2.f30102k1.s(append);
                                    photoViewer2.f30049e0.addView(photoViewer2.f30102k1, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f30102k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f30102k1.m(0.0f, (photoViewer2.f30094j1.getWidth() / 2.0f) + photoViewer2.f30094j1.getX() + photoViewer2.H0.getX());
                                    bi.x4 x4Var2 = photoViewer2.f30102k1;
                                    x4Var2.f3890l0 = new jh(2, x4Var2);
                                    x4Var2.d = 3500L;
                                    x4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f30094j1.getTag() == null) {
                        if (photoViewer2.f30100j8) {
                            if (photoViewer2.f30117m1 == null) {
                                wu0 wu0Var = photoViewer2.f30049e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.uq0(textView2, 17);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                wu0Var.addView((View) textView2, w7.a6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f30117m1 = textView2;
                            }
                            photoViewer2.f30117m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.m21 m21Var = photoViewer2.f30117m1;
                            org.telegram.ui.Components.f71 f71Var = photoViewer2.f30094j1;
                            org.telegram.ui.Components.uq0 uq0Var = m21Var.d;
                            if (f71Var != null) {
                                m21Var.f25153a = f71Var;
                                m21Var.a();
                                m21Var.f25155c = true;
                                AndroidUtilities.cancelRunOnUIThread(uq0Var);
                                AndroidUtilities.runOnUIThread(uq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = m21Var.f25154b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    m21Var.f25154b.cancel();
                                    m21Var.f25154b = null;
                                }
                                if (m21Var.getVisibility() != 0) {
                                    m21Var.setAlpha(0.0f);
                                    m21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = m21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    m21Var.f25154b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.Y2(true);
                    photoViewer2.p2(1);
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.Components.w70) this.f35621b).K((org.telegram.ui.Components.w70) this.f35622c);
                return;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35621b;
                ((AlertDialog$Builder) this.f35622c).f17528a.L0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i19 = 30;
                } else if (num2.intValue() == 1) {
                    i19 = 90;
                } else if (num2.intValue() == 2) {
                    i19 = 182;
                } else if (num2.intValue() == 3) {
                    i19 = 365;
                } else if (num2.intValue() == 4) {
                    i19 = 548;
                } else if (num2.intValue() == 5) {
                    i19 = 730;
                } else {
                    i19 = 0;
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(privacySettingsActivity.getParentActivity(), 3, null);
                d2Var.f17621g0 = false;
                d2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i19;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ms0(privacySettingsActivity, d2Var, setaccountttl, 2));
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.f35621b;
                profileActivity.getClass();
                org.telegram.ui.Components.pc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f35622c).url);
                return;
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f35621b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f35622c;
                long j11 = profileActivity2.f30381e1;
                long j12 = profileActivity2.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.G2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                rq rqVar = new rq(j11, j12, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                rqVar.X0 = new rz0(profileActivity2, chat, rqVar);
                profileActivity2.presentFragment(rqVar);
                return;
            case 28:
                a(view);
                return;
            default:
                a61 a61Var2 = (a61) this.f35621b;
                Context context5 = (Context) this.f35622c;
                if (a61Var2.f33297w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    fz0 fz0Var = new fz0(3, a61Var2, zArr);
                    Pattern pattern2 = org.telegram.ui.Components.d5.f22289a;
                    if (context5 == null) {
                        a61Var = a61Var2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.c3 c3Var2 = new org.telegram.ui.ActionBar.c3(context5, null);
                        c3Var2.a();
                        org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context5, null);
                        dd0Var.setTextColor(w02);
                        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        dd0Var.setItemCount(5);
                        org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0(context5, null);
                        dd0Var2.setItemCount(5);
                        dd0Var2.setTextColor(w02);
                        dd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.dd0 dd0Var3 = new org.telegram.ui.Components.dd0(context5, null);
                        dd0Var3.setItemCount(5);
                        dd0Var3.setTextColor(w02);
                        dd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context5, dd0Var, dd0Var2, dd0Var3, 3);
                        org.telegram.ui.Components.dd0 dd0Var4 = dd0Var3;
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        v3Var.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView3 = new TextView(context5);
                        textView3.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView3.setTextColor(w02);
                        textView3.setTextSize(1, 20.0f);
                        textView3.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView3, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView3.setOnTouchListener(new ai.h(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        v3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        di.h hVar = new di.h(context5, 16);
                        linearLayout.addView(dd0Var, w7.a6.l(0.5f, 0, 270));
                        dd0Var.setMinValue(0);
                        dd0Var.setMaxValue(365);
                        dd0Var.setWrapSelectorWheel(false);
                        dd0Var.setFormatter(new org.telegram.ui.Components.b(7));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(dd0Var, dd0Var2, dd0Var4, 15);
                        dd0Var.setOnValueChangedListener(aVar);
                        dd0Var2.setMinValue(0);
                        dd0Var2.setMaxValue(23);
                        linearLayout.addView(dd0Var2, w7.a6.l(0.2f, 0, 270));
                        dd0Var2.setFormatter(new org.telegram.ui.Components.b(8));
                        dd0Var2.setOnValueChangedListener(aVar);
                        dd0Var4.setMinValue(0);
                        dd0Var4.setMaxValue(59);
                        dd0Var4.setValue(0);
                        dd0Var4.setFormatter(new org.telegram.ui.Components.b(9));
                        linearLayout.addView(dd0Var4, w7.a6.l(0.3f, 0, 270));
                        dd0Var4.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j13 = currentTimeMillis2 * 1000;
                            a61Var = a61Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j13 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j13);
                            if (timeInMillis >= 0) {
                                dd0Var4 = dd0Var4;
                                dd0Var4.setValue(calendar.get(12));
                                dd0Var2.setValue(calendar.get(11));
                                dd0Var.setValue(timeInMillis);
                            } else {
                                dd0Var4 = dd0Var4;
                            }
                        } else {
                            a61Var = a61Var2;
                        }
                        org.telegram.ui.Components.dd0 dd0Var5 = dd0Var4;
                        org.telegram.ui.Components.d5.g(null, null, 0L, 0L, 0, dd0Var, dd0Var2, dd0Var5);
                        hVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        hVar.setGravity(17);
                        hVar.setTextColor(w04);
                        hVar.setTextSize(1, 14.0f);
                        hVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        hVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        hVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(hVar, w7.a6.t(-1, 48, 83, 16, 15, 16, 16));
                        c3Var = c3Var2;
                        hVar.setOnClickListener(new org.telegram.ui.Components.o0(dd0Var, dd0Var2, dd0Var5, calendar, fz0Var, c3Var2, 1));
                        c3Var.b(v3Var);
                        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
                        h3Var.show();
                        h3Var.setBackgroundColor(w03);
                        h3Var.fixNavigationBar(w03);
                    }
                    c3Var.f17571a.setOnHideListener(new di.h0(a61Var, zArr, 11));
                    org.telegram.ui.ActionBar.h3 h3Var2 = c3Var.f17571a;
                    h3Var2.show();
                    a61Var.f33297w = h3Var2;
                    a61Var.c(false);
                    return;
                }
                return;
        }
    }
}
