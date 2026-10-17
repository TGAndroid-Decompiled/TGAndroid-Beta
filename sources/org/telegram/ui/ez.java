package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ez implements View.OnClickListener {
    public final int f36743a;
    public final lz f36744b;

    public ez(lz lzVar, int i10) {
        this.f36743a = i10;
        this.f36744b = lzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36743a) {
            case 0:
                lz lzVar = this.f36744b;
                String str = lzVar.f37373s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.wh.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(lzVar.f37372r));
                    return;
                }
                return;
            case 1:
                lz lzVar2 = this.f36744b;
                FrameLayout frameLayout = lzVar2.f37367a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    lzVar2.postDelayed(new fz(lzVar2, 0), 180L);
                }
                float[] fArr = lzVar2.f37376y;
                if (lzVar2.f37375x == null && lzVar2.f37373s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(lzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(lzVar2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                    e1Var.setOnClickListener(new ez(lzVar2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(lzVar2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                    e1Var2.setOnClickListener(new ez(lzVar2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(lzVar2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.f21207p7;
                    e1Var3.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
                    e1Var3.setOnClickListener(new ez(lzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    FrameLayout overlayContainerView = lzVar2.f37372r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        gz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ei.g6 g6Var = new ei.g6(lzVar2, lzVar2.getContext(), overlayContainerView, 9);
                        xh xhVar = new xh(g6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(xhVar);
                        overlayContainerView.addView(g6Var, w7.z5.d(-1.0f, -1));
                        float f10 = 0.0f;
                        g6Var.setAlpha(0.0f);
                        g6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        lzVar2.f37375x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.m90(lzVar2, g6Var, overlayContainerView, xhVar, 1));
                        lzVar2.f37375x.setOutsideTouchable(true);
                        lzVar2.f37375x.setFocusable(true);
                        lzVar2.f37375x.setBackgroundDrawable(new ColorDrawable(0));
                        lzVar2.f37375x.setAnimationStyle(R.style.PopupContextAnimation);
                        lzVar2.f37375x.setInputMethodMode(2);
                        lzVar2.f37375x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wt(lzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        lzVar2.f37375x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                lz lzVar3 = this.f36744b;
                String str2 = lzVar3.f37373s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.wh.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(lzVar3.f37372r));
                    return;
                }
                return;
            case 3:
                lz lzVar4 = this.f36744b;
                if (lzVar4.f37373s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", lzVar4.f37373s);
                        lzVar4.f37372r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                lz lzVar5 = this.f36744b;
                org.telegram.ui.ActionBar.m1 m1Var2 = lzVar5.f37375x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                nz nzVar = lzVar5.E.f39278c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(lzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(lzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lzVar5.getContext());
                    alertDialog$Builder.f20601a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(lzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(nzVar.f39590c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21281t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new kz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new e7(lzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    yp ypVar = new yp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.setOnShowListener(ypVar);
                    b2Var.setOnDismissListener(new jz(0, editTextBoldCursor));
                    b2Var.show();
                    b2Var.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                lz lzVar6 = this.f36744b;
                org.telegram.ui.ActionBar.m1 m1Var3 = lzVar6.f37375x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (lzVar6.f37373s != null) {
                    org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(lzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), lzVar6.f37373s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    fj0Var.n(R.raw.qr_code_logo);
                    fj0Var.show();
                    return;
                }
                return;
            default:
                lz lzVar7 = this.f36744b;
                org.telegram.ui.ActionBar.m1 m1Var4 = lzVar7.f37375x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                nz nzVar2 = lzVar7.E.f39278c;
                tL_inputChatlistDialogFilter.filter_id = nzVar2.f39590c.f17795id;
                tL_chatlists_deleteExportedInvite.slug = nzVar2.b0();
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(lzVar7.getContext(), 3, null);
                b2Var2.q(180L);
                nzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new xc(26, lzVar7, b2Var2));
                return;
        }
    }
}
