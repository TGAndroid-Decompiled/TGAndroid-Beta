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
public final class qf implements View.OnClickListener {
    public final int f36413a;
    public final Object f36414b;
    public final Object f36415c;

    public qf(int i10, Object obj, Object obj2) {
        this.f36413a = i10;
        this.f36414b = obj;
        this.f36415c = obj2;
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
        org.telegram.ui.Components.gs gsVar;
        int i11 = this.f36413a;
        s4.c1 c1Var = null;
        Object obj = this.f36415c;
        Object obj2 = this.f36414b;
        switch (i11) {
            case 0:
                xn xnVar = (xn) obj2;
                if (xnVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    xnVar.Q7();
                    UndoView undoView = xnVar.y3;
                    if (undoView != null) {
                        long j3 = xnVar.T5;
                        int i12 = UndoView.f22199e0;
                        undoView.j(83, j3, new k4(xnVar, 1));
                    }
                }
                xnVar.A7(true);
                return;
            case 1:
                xn.I0((xn) obj2, (String) obj);
                return;
            case 2:
                xn.y1((xn) obj2, (org.telegram.ui.Components.o70) obj);
                return;
            case 3:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) obj2;
                boolean z10 = !z1Var.b();
                z1Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                xn.z1((xn) obj2, (Context) obj);
                return;
            case 5:
                so soVar = (so) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18414a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.h6.f18972n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
                linearLayout.addView(f7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !soVar.J0);
                    } else if (ChatObject.isChannel(soVar.f37374x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, soVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, soVar.J0);
                    }
                    f7.addView(j6VarArr[i13], w7.x5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new a0(soVar, j6VarArr, a3Var, 8));
                    i13++;
                }
                a3Var.b(linearLayout);
                soVar.showDialog(f3Var);
                return;
            case 6:
                so.U((so) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                lq.V((lq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                v0Var.M(null, null);
                v0Var.G(c5Var.d, false);
                v0Var.setupPopupRadialSelectors(c5Var.f22925f);
                v0Var.B(c5Var.e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                ((ai.s4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f18409a.L0.run();
                ((ju) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f18414a.dismissRunnable;
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
                ((org.telegram.ui.Components.o70) obj).u();
                j8Var.t0(6);
                return;
            case 18:
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                int h02 = org.telegram.ui.Components.j8.h0(j8Var2);
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(s90Var.getText().toString())) {
                    String charSequence = s90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ry) {
                        ry ryVar = (ry) launchActivity.O().getLastFragment();
                        int totalDialogsCount = ryVar.getMessagesController().getTotalDialogsCount();
                        if (!ryVar.f37014l2 && (totalDialogsCount > 10 || ryVar.K)) {
                            if (!ryVar.f37006j2) {
                                ryVar.f37073x = 3;
                                ryVar.X.f22890r.setText(charSequence);
                                ryVar.X.f22890r.setSelection(charSequence.length());
                            } else {
                                ryVar.X.f22890r.setText(charSequence);
                                ryVar.X.f22890r.setSelection(charSequence.length());
                                ay ayVar = ryVar.C0;
                                if (ayVar != null && (L = ayVar.L(3)) >= 0 && ryVar.C0.getTabsView().getCurrentTabId() != L) {
                                    ryVar.C0.getTabsView().d(L, L);
                                }
                            }
                            j8Var2.dismiss();
                            return;
                        }
                    }
                    ry ryVar2 = new ry(null);
                    ryVar2.f37023n2 = charSequence;
                    ryVar2.f37073x = 3;
                    launchActivity.q0(ryVar2, false, false);
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
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f23359n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f23359n.document)) {
                            FileLoader.getInstance(daVar.f23361s).loadFile(daVar.f23359n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(daVar.getContext(), daVar.f23359n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.o70 o70Var = ldVar.X0;
                if (o70Var != null && o70Var.D()) {
                    ldVar.X0.u();
                    ldVar.X0 = null;
                    return;
                }
                ldVar.f25866d1.e(true);
                org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(frameLayout, new ai.d(), ldVar.V0);
                ldVar.X0 = F;
                F.f26669s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                ldVar.X0.k();
                for (int i15 : ldVar.f25865c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    ldVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.kd(ldVar, i15, 0), false);
                    if (ldVar.f25864b1 == i15) {
                        ldVar.X0.L();
                    }
                }
                ldVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.el elVar = (org.telegram.ui.Components.el) obj2;
                org.telegram.ui.Components.gl glVar = (org.telegram.ui.Components.gl) obj;
                org.telegram.ui.Components.hl hlVar = elVar.f23717b;
                org.telegram.ui.Components.wi wiVar = hlVar.f26744b;
                xn xnVar2 = (xn) wiVar.f29665f0;
                if (xnVar2.c()) {
                    parentActivity = hlVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, xnVar2.a(), new org.telegram.ui.Components.b3(3, elVar, glVar), hlVar.f26743a);
                    return;
                }
                org.telegram.ui.Components.e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new oc(20, elVar, glVar));
                return;
            case 23:
                org.telegram.ui.Components.vn vnVar = ((org.telegram.ui.Components.tn) obj2).d;
                wb1 wb1Var = vnVar.f28805s;
                View F2 = wb1Var.F((org.telegram.ui.Components.sn) obj);
                if (F2 != null) {
                    c1Var = wb1Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - vnVar.f28807t0) >= 0 && b10 < vnVar.K.length) {
                    org.telegram.ui.Components.vn.O(vnVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                xn xnVar3 = foVar.G;
                if (foVar.T) {
                    xnVar3.showDialog(org.telegram.ui.Components.e5.V(foVar.getContext(), xnVar3.h, d6Var).f18409a);
                    return;
                }
                org.telegram.ui.Components.ao aoVar = foVar.e;
                if (xnVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = xnVar3.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (foVar.f24016a.f13963f && xnVar3.getParentActivity() != null && xnVar3.fragmentView != null && xnVar3.Z7 != null) {
                            if (xnVar3.f39483o2 == null) {
                                org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(7, xnVar3.getParentActivity(), xnVar3.f39370ea, true);
                                xnVar3.f39483o2 = j40Var;
                                j40Var.setAlpha(0.0f);
                                xnVar3.f39483o2.setVisibility(4);
                                xnVar3.f39483o2.setShowingDuration(4000L);
                                xnVar3.X0.addView(xnVar3.f39483o2, w7.x5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = xnVar3.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            xnVar3.f39483o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            xnVar3.f39483o2.f(xnVar3.f39310a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = xnVar3.Z7;
                    TLRPC.UserFull userFull = xnVar3.f39316a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(foVar.getContext(), null, new org.telegram.ui.Components.bo(foVar, r4), true, 0, foVar.f24022d0);
                    o8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.f26678a;
                    org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(foVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {coVar};
                    coVar.e = true;
                    coVar.f19407c = 220;
                    coVar.setOutsideTouchable(true);
                    n1VarArr[0].setClippingEnabled(true);
                    n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    n1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1VarArr[0].setInputMethodMode(2);
                    n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n1VarArr[0].showAtLocation(aoVar, 0, (int) (foVar.getX() + aoVar.getX()), (int) aoVar.getY());
                    xnVar3.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.np.n((org.telegram.ui.Components.np) obj, (xn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.nr.P((org.telegram.ui.Components.nr) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.vr vrVar = (org.telegram.ui.Components.vr) obj2;
                String str = (String) obj;
                if (vrVar.f29378b == null && (view2 = vrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        vrVar.f29378b = (EditText) findFocus;
                    }
                }
                if (vrVar.f29378b != null) {
                    try {
                        vrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = vrVar.f29378b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = vrVar.f29378b.getText();
                    if (vrVar.f29378b.getSelectionEnd() == vrVar.f29378b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + vrVar.f29378b.getSelectionStart();
                    }
                    if (vrVar.f29378b.getSelectionStart() != -1 && vrVar.f29378b.getSelectionEnd() != -1) {
                        EditText editText2 = vrVar.f29378b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), vrVar.f29378b.getSelectionEnd(), str));
                        EditText editText3 = vrVar.f29378b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        vrVar.f29378b.setText(str);
                        EditText editText4 = vrVar.f29378b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = vrVar.f29378b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.gs gsVar2 = (org.telegram.ui.Components.gs) obj2;
                org.telegram.ui.Components.fs fsVar = (org.telegram.ui.Components.fs) obj;
                gsVar2.J();
                fsVar.f24084f = !fsVar.f24084f;
                fsVar.f24087j.X.N(true);
                gsVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.gs) obj2).B0 = !gsVar.B0;
                ((org.telegram.ui.Components.v51) obj).N(true);
                return;
        }
    }

    public qf(org.telegram.ui.Components.np npVar, xn xnVar) {
        this.f36413a = 25;
        this.f36415c = npVar;
        this.f36414b = xnVar;
    }
}
