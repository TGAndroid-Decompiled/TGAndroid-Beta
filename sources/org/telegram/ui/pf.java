package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class pf implements View.OnClickListener {
    public final int f36510a;
    public final Object f36511b;
    public final Object f36512c;

    public pf(int i10, Object obj, Object obj2) {
        this.f36510a = i10;
        this.f36511b = obj;
        this.f36512c = obj2;
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
        org.telegram.ui.Components.hs hsVar;
        int i11 = this.f36510a;
        s4.c1 c1Var = null;
        Object obj = this.f36512c;
        Object obj2 = this.f36511b;
        switch (i11) {
            case 0:
                wn wnVar = (wn) obj2;
                if (wnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    wnVar.Q7();
                    UndoView undoView = wnVar.y3;
                    if (undoView != null) {
                        long j3 = wnVar.T5;
                        int i12 = UndoView.f22450e0;
                        undoView.j(83, j3, new k4(wnVar, 1));
                    }
                }
                wnVar.A7(true);
                return;
            case 1:
                wn.X((wn) obj2, (String) obj);
                return;
            case 2:
                wn.a1((wn) obj2, (org.telegram.ui.Components.z70) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                wn.z1((wn) obj2, (Context) obj);
                return;
            case 5:
                ro roVar = (ro) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f19949a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.h6.f19242n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
                linearLayout.addView(f7, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !roVar.J0);
                    } else if (ChatObject.isChannel(roVar.f37419x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, roVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, roVar.J0);
                    }
                    f7.addView(j6VarArr[i13], w7.y5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new a0(roVar, j6VarArr, z2Var, 8));
                    i13++;
                }
                z2Var.b(linearLayout);
                roVar.showDialog(e3Var);
                return;
            case 6:
                ro.U((ro) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                kq.V((kq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                return;
            case 8:
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.d6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                u0Var.M(null, null);
                u0Var.G(c5Var.d, false);
                u0Var.setupPopupRadialSelectors(c5Var.f23207f);
                u0Var.B(c5Var.e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.s4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f18661a.L0.run();
                ((iu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).f19949a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.j8.F((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.z70) obj).u();
                j8Var.t0(6);
                return;
            case 18:
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                int h02 = org.telegram.ui.Components.j8.h0(j8Var2);
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(da0Var.getText().toString())) {
                    String charSequence = da0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof qy) {
                        qy qyVar = (qy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = qyVar.getMessagesController().getTotalDialogsCount();
                        if (!qyVar.f37068l2 && (totalDialogsCount > 10 || qyVar.K)) {
                            if (!qyVar.f37060j2) {
                                qyVar.f37127x = 3;
                                qyVar.X.f23475r.setText(charSequence);
                                qyVar.X.f23475r.setSelection(charSequence.length());
                            } else {
                                qyVar.X.f23475r.setText(charSequence);
                                qyVar.X.f23475r.setSelection(charSequence.length());
                                zx zxVar = qyVar.C0;
                                if (zxVar != null && (L = zxVar.L(3)) >= 0 && qyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    qyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            j8Var2.dismiss();
                            return;
                        }
                    }
                    qy qyVar2 = new qy(null);
                    qyVar2.f37077n2 = charSequence;
                    qyVar2.f37127x = 3;
                    launchActivity.q0(qyVar2, false, false);
                    j8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.w1(e9Var.Y);
                e9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f23643n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f23643n.document)) {
                            FileLoader.getInstance(daVar.f23645s).loadFile(daVar.f23643n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(daVar.getContext(), daVar.f23643n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.md mdVar = (org.telegram.ui.Components.md) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.z70 z70Var = mdVar.X0;
                if (z70Var != null && z70Var.D()) {
                    mdVar.X0.u();
                    mdVar.X0 = null;
                    return;
                }
                mdVar.f26365d1.e(true);
                org.telegram.ui.Components.z70 F = org.telegram.ui.Components.z70.F(frameLayout, new ai.d(), mdVar.V0);
                mdVar.X0 = F;
                F.f30839s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                mdVar.X0.k();
                for (int i15 : mdVar.f26364c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    mdVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.ld(mdVar, i15, 0), false);
                    if (mdVar.f26363b1 == i15) {
                        mdVar.X0.L();
                    }
                }
                mdVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj2;
                org.telegram.ui.Components.hl hlVar = (org.telegram.ui.Components.hl) obj;
                org.telegram.ui.Components.il ilVar = flVar.f24291b;
                org.telegram.ui.Components.wi wiVar = ilVar.f27043b;
                wn wnVar2 = (wn) wiVar.f30020f0;
                if (wnVar2.c()) {
                    parentActivity = ilVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, wnVar2.a(), new org.telegram.ui.Components.w2(4, flVar, hlVar), ilVar.f27042a);
                    return;
                }
                org.telegram.ui.Components.e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new oc(20, flVar, hlVar));
                return;
            case 23:
                org.telegram.ui.Components.wn wnVar3 = ((org.telegram.ui.Components.un) obj2).d;
                wb1 wb1Var = wnVar3.f30137s;
                View F2 = wb1Var.F((org.telegram.ui.Components.tn) obj);
                if (F2 != null) {
                    c1Var = wb1Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - wnVar3.f30139t0) >= 0 && b10 < wnVar3.K.length) {
                    org.telegram.ui.Components.wn.O(wnVar3, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.go goVar = (org.telegram.ui.Components.go) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                wn wnVar4 = goVar.G;
                if (goVar.T) {
                    wnVar4.showDialog(org.telegram.ui.Components.e5.V(goVar.getContext(), wnVar4.h, d6Var).f18661a);
                    return;
                }
                org.telegram.ui.Components.bo boVar = goVar.e;
                if (wnVar4.getParentActivity() != null) {
                    TLRPC.Chat chat = wnVar4.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (goVar.f24533a.f14201f && wnVar4.getParentActivity() != null && wnVar4.fragmentView != null && wnVar4.Z7 != null) {
                            if (wnVar4.f39581o2 == null) {
                                org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(7, wnVar4.getParentActivity(), wnVar4.f39468ea, true);
                                wnVar4.f39581o2 = k40Var;
                                k40Var.setAlpha(0.0f);
                                wnVar4.f39581o2.setVisibility(4);
                                wnVar4.f39581o2.setShowingDuration(4000L);
                                wnVar4.X0.addView(wnVar4.f39581o2, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = wnVar4.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            wnVar4.f39581o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            wnVar4.f39581o2.f(wnVar4.f39408a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = wnVar4.Z7;
                    TLRPC.UserFull userFull = wnVar4.f39414a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(goVar.getContext(), null, new org.telegram.ui.Components.co(goVar, r4), true, 0, goVar.f24539d0);
                    o8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.f26993a;
                    org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(goVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {eoVar};
                    eoVar.e = true;
                    eoVar.f19635c = 220;
                    eoVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(boVar, 0, (int) (goVar.getX() + boVar.getX()), (int) boVar.getY());
                    wnVar4.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.op.n((org.telegram.ui.Components.op) obj, (wn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.or.P((org.telegram.ui.Components.or) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.wr wrVar = (org.telegram.ui.Components.wr) obj2;
                String str = (String) obj;
                if (wrVar.f30191b == null && (view2 = wrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        wrVar.f30191b = (EditText) findFocus;
                    }
                }
                if (wrVar.f30191b != null) {
                    try {
                        wrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = wrVar.f30191b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = wrVar.f30191b.getText();
                    if (wrVar.f30191b.getSelectionEnd() == wrVar.f30191b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + wrVar.f30191b.getSelectionStart();
                    }
                    if (wrVar.f30191b.getSelectionStart() != -1 && wrVar.f30191b.getSelectionEnd() != -1) {
                        EditText editText2 = wrVar.f30191b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), wrVar.f30191b.getSelectionEnd(), str));
                        EditText editText3 = wrVar.f30191b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        wrVar.f30191b.setText(str);
                        EditText editText4 = wrVar.f30191b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = wrVar.f30191b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.hs hsVar2 = (org.telegram.ui.Components.hs) obj2;
                org.telegram.ui.Components.gs gsVar = (org.telegram.ui.Components.gs) obj;
                hsVar2.J();
                gsVar.f24579f = !gsVar.f24579f;
                gsVar.f24582j.X.N(true);
                hsVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.hs) obj2).B0 = !hsVar.B0;
                ((org.telegram.ui.Components.k61) obj).N(true);
                return;
        }
    }

    public pf(org.telegram.ui.Components.op opVar, wn wnVar) {
        this.f36510a = 25;
        this.f36512c = opVar;
        this.f36511b = wnVar;
    }
}
