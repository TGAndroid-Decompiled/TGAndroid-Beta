package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wa1;
public final class t2 implements View.OnClickListener {
    public final int f32820a;
    public final Object f32821b;
    public final Object f32822c;

    public t2(int i10, Object obj, Object obj2) {
        this.f32820a = i10;
        this.f32821b = obj;
        this.f32822c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int L;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        as asVar;
        f2.n1 T;
        long j10;
        int i11 = this.f32820a;
        int i12 = -1;
        f2.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f32822c;
        Object obj2 = this.f32821b;
        switch (i11) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                ((ag.w0) obj).run();
                return;
            case 1:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f22714a.H0.run();
                ((org.telegram.ui.cu) obj).onClick(null, intValue);
                return;
            case 2:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f22729a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 3:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 4:
                g8.E((g8) obj2, (float[]) obj);
                return;
            case 5:
                g8 g8Var = (g8) obj2;
                g8Var.getClass();
                ((j70) obj).u();
                g8Var.t0(7);
                return;
            case 6:
                n90 n90Var = (n90) obj;
                g8 g8Var2 = ((x7) obj2).B;
                int h02 = g8.h0(g8Var2);
                LaunchActivity launchActivity = g8Var2.C0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(n90Var.getText().toString())) {
                    String charSequence = n90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.fy) {
                        org.telegram.ui.fy fyVar = (org.telegram.ui.fy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = fyVar.getMessagesController().getTotalDialogsCount();
                        if (!fyVar.f38295h2 && (totalDialogsCount > 10 || fyVar.G)) {
                            if (!fyVar.f38285f2) {
                                fyVar.f38371x = 3;
                                fyVar.T.f34546r.setText(charSequence);
                                fyVar.T.f34546r.setSelection(charSequence.length());
                            } else {
                                fyVar.T.f34546r.setText(charSequence);
                                fyVar.T.f34546r.setSelection(charSequence.length());
                                org.telegram.ui.ox oxVar = fyVar.f38377y0;
                                if (oxVar != null && (L = oxVar.L(3)) >= 0 && fyVar.f38377y0.getTabsView().getCurrentTabId() != L) {
                                    fyVar.f38377y0.getTabsView().d(L, L);
                                }
                            }
                            g8Var2.dismiss();
                            return;
                        }
                    }
                    org.telegram.ui.fy fyVar2 = new org.telegram.ui.fy(null);
                    fyVar2.f38305j2 = charSequence;
                    fyVar2.f38371x = 3;
                    launchActivity.q0(fyVar2, false, false);
                    g8Var2.dismiss();
                    return;
                }
                return;
            case 7:
                b9 b9Var = (b9) obj;
                ((boolean[]) obj2)[0] = true;
                b9Var.F.w1(b9Var.U);
                b9Var.O.dismiss();
                return;
            case 8:
                aa aaVar = (aa) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        ye.d.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        ye.d.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(aaVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = aaVar.f26727n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) aaVar.getContext(), aaVar.f26727n.document)) {
                            FileLoader.getInstance(aaVar.f26729s).loadFile(aaVar.f26727n.document, "update", 3, 1);
                            aaVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        ye.d.s(aaVar.getContext(), aaVar.f26727n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 9:
                ed edVar = (ed) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                j70 j70Var = edVar.T0;
                if (j70Var != null && j70Var.D()) {
                    edVar.T0.u();
                    edVar.T0 = null;
                    return;
                }
                edVar.Z0.e(true);
                j70 F = j70.F(frameLayout, new lh.b(), edVar.R0);
                edVar.T0 = F;
                F.f29600s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                edVar.T0.k();
                for (int i13 : edVar.Y0) {
                    if (i13 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i13 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i13, new Object[0]);
                    }
                    edVar.T0.c(0, formatPluralString, new i8(edVar, i13, 1), false);
                    if (edVar.X0 == i13) {
                        edVar.T0.L();
                    }
                }
                edVar.T0.Z();
                return;
            case 10:
                yk ykVar = (yk) obj2;
                al alVar = (al) obj;
                bl blVar = ykVar.f35086b;
                ni niVar = blVar.f28403b;
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) niVar.f30990b0;
                if (tnVar.c()) {
                    parentActivity = blVar.getParentActivity();
                    c5.M(parentActivity, tnVar.a(), new j1(12, ykVar, alVar), blVar.f28402a);
                    return;
                }
                c5.a0(niVar.F1, niVar.j1() + 1, niVar.n1(), new org.telegram.ui.tm(8, ykVar, alVar));
                return;
            case 11:
                on onVar = ((mn) obj2).d;
                wa1 wa1Var = onVar.f31427s;
                View F2 = wa1Var.F((ln) obj);
                if (F2 != null) {
                    n1Var = wa1Var.T(F2);
                }
                if (n1Var != null && (b10 = n1Var.b() - onVar.f31423p0) >= 0 && b10 < onVar.G.length) {
                    on.O(onVar, b10);
                    return;
                }
                return;
            case 12:
                xn xnVar = (xn) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                org.telegram.ui.tn tnVar2 = xnVar.C;
                if (xnVar.P) {
                    tnVar2.showDialog(c5.V(xnVar.getContext(), tnVar2.h, c6Var).f22714a);
                    return;
                }
                tn tnVar3 = xnVar.f34790e;
                if (tnVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = tnVar2.f42787e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (xnVar.f34783a.f49506f && tnVar2.getParentActivity() != null && tnVar2.fragmentView != null && tnVar2.V7 != null) {
                            if (tnVar2.f42866k2 == null) {
                                g40 g40Var = new g40(7, tnVar2.getParentActivity(), tnVar2.f42746aa, true);
                                tnVar2.f42866k2 = g40Var;
                                g40Var.setAlpha(0.0f);
                                tnVar2.f42866k2.setVisibility(4);
                                tnVar2.f42866k2.setShowingDuration(4000L);
                                tnVar2.T0.addView(tnVar2.f42866k2, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i14 = tnVar2.V7.ttl_period;
                            if (i14 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i14 / 86400, new Object[0]);
                            } else if (i14 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i14 / 3600, new Object[0]);
                            } else if (i14 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i14 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                            }
                            tnVar2.f42866k2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            tnVar2.f42866k2.f(tnVar2.W0.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = tnVar2.V7;
                    TLRPC.UserFull userFull = tnVar2.W7;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    m8 m8Var = new m8(xnVar.getContext(), null, new un(xnVar, r3), true, 0, xnVar.W);
                    m8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m8Var.f30594a;
                    vn vnVar = new vn(xnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.o1[] o1VarArr = {vnVar};
                    vnVar.f23712e = true;
                    vnVar.f23711c = 220;
                    vnVar.setOutsideTouchable(true);
                    o1VarArr[0].setClippingEnabled(true);
                    o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    o1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1VarArr[0].setInputMethodMode(2);
                    o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    o1VarArr[0].showAtLocation(tnVar3, 0, (int) (xnVar.getX() + tnVar3.getX()), (int) tnVar3.getY());
                    tnVar2.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 13:
                gp.n((gp) obj2, (org.telegram.ui.tn) obj);
                return;
            case 14:
                fr.P((fr) obj2, (TLRPC.Peer) obj);
                return;
            case 15:
                or orVar = (or) obj2;
                String str = (String) obj;
                if (orVar.f31458b == null && (view2 = orVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        orVar.f31458b = (EditText) findFocus;
                    }
                }
                if (orVar.f31458b != null) {
                    try {
                        orVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = orVar.f31458b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = orVar.f31458b.getText();
                    if (orVar.f31458b.getSelectionEnd() == orVar.f31458b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + orVar.f31458b.getSelectionStart();
                    }
                    if (orVar.f31458b.getSelectionStart() != -1 && orVar.f31458b.getSelectionEnd() != -1) {
                        EditText editText2 = orVar.f31458b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), orVar.f31458b.getSelectionEnd(), str));
                        EditText editText3 = orVar.f31458b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        orVar.f31458b.setText(str);
                        EditText editText4 = orVar.f31458b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = orVar.f31458b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                as asVar2 = (as) obj2;
                zr zrVar = (zr) obj;
                asVar2.I();
                zrVar.f35405f = !zrVar.f35405f;
                zrVar.f35408j.T.N(true);
                asVar2.s();
                return;
            case 17:
                ((as) obj2).f26863x0 = !asVar.f26863x0;
                ((k51) obj).N(true);
                return;
            case 18:
                ((xs) obj2).dismiss();
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new org.telegram.ui.x6());
                return;
            case 19:
                jv.o((jv) obj2, (y5) obj);
                return;
            case 20:
                wy wyVar = (wy) obj2;
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) obj;
                fz fzVar = wyVar.v;
                lw lwVar = fzVar.f28657z0;
                if (lwVar.indexOfChild(k8Var) != -1 && (T = lwVar.T(k8Var)) != null) {
                    if (T.b() == fzVar.f28579b1) {
                        if (fzVar.f28586d1 != null) {
                            fy fyVar3 = fzVar.f28623p1;
                            if (fyVar3 != null) {
                                fyVar3.y(fzVar.F1.f22393id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(fzVar.Y0).edit();
                        String str2 = "group_hide_stickers_" + fzVar.F1.f22393id;
                        TLRPC.StickerSet stickerSet = fzVar.F1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f22419id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        fzVar.Z(false);
                        wy wyVar2 = fzVar.f28639u0;
                        if (wyVar2 != null) {
                            wyVar2.l();
                            return;
                        }
                        return;
                    } else if (wyVar.h.get(T.b()) == fzVar.f28594f1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.f34509c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new cv(wyVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 21:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.I0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                int i15 = 0;
                while (true) {
                    if (i15 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i15]) {
                            i12 = i15;
                        } else {
                            i15++;
                        }
                    }
                }
                int i16 = i12 + 1;
                if (i16 >= 3) {
                    i16 = 0;
                }
                float f9 = fArr[i16];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f9);
                fragmentContextView.l(playbackSpeed, f9, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.f26417x0 > 300) {
                    int i17 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i17 > 2) {
                        i17 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i17).apply();
                    if (i17 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.zi ziVar = new org.telegram.ui.zi(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.f26415w0 = ziVar;
                        ziVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.f26415w0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.f26415w0, marginLayoutParams);
                        fragmentContextView.f26415w0.f(fragmentContextView.B, true);
                    }
                }
                fragmentContextView.f26417x0 = currentTimeMillis;
                return;
            case 22:
                x10 x10Var = (x10) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = x10Var.B.indexOf(v0Var.getFilter());
                if (x10Var.E != indexOf) {
                    x10Var.E = indexOf;
                    x10Var.f();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f23859a.f49506f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    rf.f0 filter = v0Var.getFilter();
                    x10Var.g(filter);
                    w10 w10Var = x10Var.D;
                    if (w10Var != null) {
                        ((org.telegram.ui.kx) w10Var).g(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 23:
                ((y2) obj).run(Long.valueOf(((c20) obj2).d));
                return;
            case 24:
                ((org.telegram.ui.tp) obj).run();
                ((u30) obj2).dismiss();
                return;
            case 25:
                ((j70) obj2).u();
                ((org.telegram.ui.dc0) obj).run();
                return;
            case 26:
                j70 j70Var2 = (j70) obj2;
                ((org.telegram.ui.hv) obj).run();
                if (j70Var2.J) {
                    j70Var2.u();
                    return;
                }
                return;
            case 27:
                t70.m((t70) obj2, (r70) obj);
                return;
            case 28:
                ke0.m((ke0) obj2, (org.telegram.ui.ActionBar.c6) obj);
                return;
            default:
                ai0 ai0Var = (ai0) obj2;
                org.telegram.ui.xr xrVar = (org.telegram.ui.xr) obj;
                if (ai0Var.F.getTag() == null) {
                    int max = (int) Math.max(1.0f, ai0Var.getValue());
                    org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) xrVar.f44645b;
                    TLRPC.User user = (TLRPC.User) xrVar.f44646c;
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(rc0Var, user, max, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        rc0Var.showDialog(c2Var2);
                    } else {
                        rc0Var.N.H = true;
                        rc0Var.f42036c.setImageResource(R.drawable.msg_location_alert2);
                        rc0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        rc0Var.getLocationController().setProximityLocation(rc0Var.f42033a0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        ai0Var.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public t2(b9 b9Var, boolean[] zArr) {
        this.f32820a = 7;
        this.f32822c = b9Var;
        this.f32821b = zArr;
    }
}
