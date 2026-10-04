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
    public final int f39709a;
    public final Object f39710b;
    public final Object f39711c;

    public qf(int i10, Object obj, Object obj2) {
        this.f39709a = i10;
        this.f39710b = obj;
        this.f39711c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int N;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        org.telegram.ui.Components.is isVar;
        int i11 = this.f39709a;
        s4.c1 c1Var = null;
        Object obj = this.f39711c;
        Object obj2 = this.f39710b;
        switch (i11) {
            case 0:
                yn ynVar = (yn) obj2;
                if (ynVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    ynVar.Q7();
                    UndoView undoView = ynVar.f43542w3;
                    if (undoView != null) {
                        long j3 = ynVar.R5;
                        int i12 = UndoView.f24368e0;
                        undoView.j(83, j3, new k4(ynVar, 1));
                    }
                }
                ynVar.A7(true);
                return;
            case 1:
                yn.E0((yn) obj2, (String) obj);
                return;
            case 2:
                yn.z1((yn) obj2, (org.telegram.ui.Components.b80) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                yn.Q0((yn) obj2, (Context) obj);
                return;
            case 5:
                to toVar = (to) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20374a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.i6.f21003n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
                linearLayout.addView(f7, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !toVar.J0);
                    } else if (ChatObject.isChannel(toVar.f40914x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, toVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, toVar.J0);
                    }
                    f7.addView(j6VarArr[i13], w7.z5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new a0(toVar, j6VarArr, a3Var, 8));
                    i13++;
                }
                a3Var.b(linearLayout);
                toVar.showDialog(f3Var);
                return;
            case 6:
                to.S((to) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                mq.T((mq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                return;
            case 8:
                new rg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.d6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.O((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                v0Var.M(null, null);
                v0Var.G(c5Var.d, false);
                v0Var.setupPopupRadialSelectors(c5Var.f25219f);
                v0Var.B(c5Var.f25218e);
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
                ((AlertDialog$Builder) obj2).f20368a.L0.run();
                ((mu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f20374a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.j8.D((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.b80) obj).u();
                j8Var.t0(6);
                return;
            case 18:
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                int h02 = org.telegram.ui.Components.j8.h0(j8Var2);
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(fa0Var.getText().toString())) {
                    String charSequence = fa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.f41429l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (!uyVar.f41421j2) {
                                uyVar.f41487x = 3;
                                uyVar.X.f26247r.setText(charSequence);
                                uyVar.X.f26247r.setSelection(charSequence.length());
                            } else {
                                uyVar.X.f26247r.setText(charSequence);
                                uyVar.X.f26247r.setSelection(charSequence.length());
                                dy dyVar = uyVar.C0;
                                if (dyVar != null && (N = dyVar.N(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != N) {
                                    uyVar.C0.getTabsView().d(N, N);
                                }
                            }
                            j8Var2.dismiss();
                            return;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.f41438n2 = charSequence;
                    uyVar2.f41487x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    j8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.y1(e9Var.Y);
                e9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(eaVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = eaVar.f26021n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) eaVar.getContext(), eaVar.f26021n.document)) {
                            FileLoader.getInstance(eaVar.f26023s).loadFile(eaVar.f26021n.document, "update", 3, 1);
                            eaVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(eaVar.getContext(), eaVar.f26021n.url);
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
                org.telegram.ui.Components.b80 b80Var = mdVar.X0;
                if (b80Var != null && b80Var.D()) {
                    mdVar.X0.u();
                    mdVar.X0 = null;
                    return;
                }
                mdVar.f28577d1.e(true);
                org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F(frameLayout, new ai.d(), mdVar.V0);
                mdVar.X0 = F;
                F.f24845s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                mdVar.X0.k();
                for (int i15 : mdVar.f28576c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    mdVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.ld(mdVar, i15, 0), false);
                    if (mdVar.f28575b1 == i15) {
                        mdVar.X0.L();
                    }
                }
                mdVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.gl glVar = (org.telegram.ui.Components.gl) obj2;
                org.telegram.ui.Components.il ilVar = (org.telegram.ui.Components.il) obj;
                org.telegram.ui.Components.jl jlVar = glVar.f26884b;
                org.telegram.ui.Components.xi xiVar = jlVar.f29643b;
                yn ynVar2 = (yn) xiVar.f32813f0;
                if (ynVar2.c()) {
                    parentActivity = jlVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, ynVar2.a(), new org.telegram.ui.Components.w2(5, glVar, ilVar), jlVar.f29642a);
                    return;
                }
                org.telegram.ui.Components.e5.a0(xiVar.J1, xiVar.h1() + 1, xiVar.l1(), new qc(20, glVar, ilVar));
                return;
            case 23:
                org.telegram.ui.Components.xn xnVar = ((org.telegram.ui.Components.vn) obj2).d;
                zb1 zb1Var = xnVar.f32937s;
                View F2 = zb1Var.F((org.telegram.ui.Components.un) obj);
                if (F2 != null) {
                    c1Var = zb1Var.T(F2);
                }
                if (c1Var != null && (b10 = c1Var.b() - xnVar.f32939t0) >= 0 && b10 < xnVar.K.length) {
                    org.telegram.ui.Components.xn.M(xnVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.ho hoVar = (org.telegram.ui.Components.ho) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                yn ynVar3 = hoVar.G;
                if (hoVar.T) {
                    ynVar3.showDialog(org.telegram.ui.Components.e5.V(hoVar.getContext(), ynVar3.h, d6Var).f20368a);
                    return;
                }
                org.telegram.ui.Components.co coVar = hoVar.f27181e;
                if (ynVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = ynVar3.f43315e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (hoVar.f27174a.f15436f && ynVar3.getParentActivity() != null && ynVar3.fragmentView != null && ynVar3.X7 != null) {
                            if (ynVar3.f43414m2 == null) {
                                org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, ynVar3.getParentActivity(), ynVar3.f43300ca, true);
                                ynVar3.f43414m2 = m40Var;
                                m40Var.setAlpha(0.0f);
                                ynVar3.f43414m2.setVisibility(4);
                                ynVar3.f43414m2.setShowingDuration(4000L);
                                ynVar3.V0.addView(ynVar3.f43414m2, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i16 = ynVar3.X7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            ynVar3.f43414m2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            ynVar3.f43414m2.f(ynVar3.Y0.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = ynVar3.X7;
                    TLRPC.UserFull userFull = ynVar3.Y7;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(hoVar.getContext(), null, new org.telegram.ui.Components.eo(hoVar, r4), true, 0, hoVar.f27180d0);
                    o8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.f29275a;
                    org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(hoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {foVar};
                    foVar.f21409e = true;
                    foVar.f21408c = 220;
                    foVar.setOutsideTouchable(true);
                    n1VarArr[0].setClippingEnabled(true);
                    n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    n1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1VarArr[0].setInputMethodMode(2);
                    n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n1VarArr[0].showAtLocation(coVar, 0, (int) (hoVar.getX() + coVar.getX()), (int) coVar.getY());
                    ynVar3.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.pp.n((org.telegram.ui.Components.pp) obj, (yn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.pr.N((org.telegram.ui.Components.pr) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.xr xrVar = (org.telegram.ui.Components.xr) obj2;
                String str = (String) obj;
                if (xrVar.f32969b == null && (view2 = xrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        xrVar.f32969b = (EditText) findFocus;
                    }
                }
                if (xrVar.f32969b != null) {
                    try {
                        xrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = xrVar.f32969b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = xrVar.f32969b.getText();
                    if (xrVar.f32969b.getSelectionEnd() == xrVar.f32969b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + xrVar.f32969b.getSelectionStart();
                    }
                    if (xrVar.f32969b.getSelectionStart() != -1 && xrVar.f32969b.getSelectionEnd() != -1) {
                        EditText editText2 = xrVar.f32969b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), xrVar.f32969b.getSelectionEnd(), str));
                        EditText editText3 = xrVar.f32969b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        xrVar.f32969b.setText(str);
                        EditText editText4 = xrVar.f32969b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = xrVar.f32969b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.is isVar2 = (org.telegram.ui.Components.is) obj2;
                org.telegram.ui.Components.hs hsVar = (org.telegram.ui.Components.hs) obj;
                isVar2.H();
                hsVar.f27228f = !hsVar.f27228f;
                hsVar.f27231j.X.N(true);
                isVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.is) obj2).B0 = !isVar.B0;
                ((org.telegram.ui.Components.u61) obj).N(true);
                return;
        }
    }

    public qf(org.telegram.ui.Components.pp ppVar, yn ynVar) {
        this.f39709a = 25;
        this.f39711c = ppVar;
        this.f39710b = ynVar;
    }
}
