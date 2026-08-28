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
public final class dz implements View.OnClickListener {
    public final int f37758a;
    public final jz f37759b;

    public dz(jz jzVar, int i9) {
        this.f37758a = i9;
        this.f37759b = jzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37758a) {
            case 0:
                jz jzVar = this.f37759b;
                String str = jzVar.f38052s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.ll.o(R.string.LinkCopied, org.telegram.ui.Components.oc.a0(jzVar.f38051r));
                    return;
                }
                return;
            case 1:
                jz jzVar2 = this.f37759b;
                FrameLayout frameLayout = jzVar2.f38045a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    jzVar2.postDelayed(new ri(jzVar2, 29), 180L);
                }
                float[] fArr = jzVar2.f38055y;
                if (jzVar2.f38054x == null && jzVar2.f38052s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(jzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(jzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, g7.e6.n(-1, 48));
                    g1Var.setOnClickListener(new dz(jzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(jzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, g7.e6.n(-1, 48));
                    g1Var2.setOnClickListener(new dz(jzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(jzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i9 = org.telegram.ui.ActionBar.f6.f23212p7;
                    g1Var3.c(org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
                    g1Var3.setOnClickListener(new dz(jzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, g7.e6.n(-1, 48));
                    FrameLayout overlayContainerView = jzVar2.f38051r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        ez.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        kh.h6 h6Var = new kh.h6(jzVar2, jzVar2.getContext(), overlayContainerView, 9);
                        sh shVar = new sh(h6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(shVar);
                        overlayContainerView.addView(h6Var, g7.e6.c(-1.0f, -1));
                        float f11 = 0.0f;
                        h6Var.setAlpha(0.0f);
                        h6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        jzVar2.f38054x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.a80(jzVar2, h6Var, overlayContainerView, shVar, 1));
                        jzVar2.f38054x.setOutsideTouchable(true);
                        jzVar2.f38054x.setFocusable(true);
                        jzVar2.f38054x.setBackgroundDrawable(new ColorDrawable(0));
                        jzVar2.f38054x.setAnimationStyle(R.style.PopupContextAnimation);
                        jzVar2.f38054x.setInputMethodMode(2);
                        jzVar2.f38054x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wt(jzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f11 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        jzVar2.f38054x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f11), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                jz jzVar3 = this.f37759b;
                String str2 = jzVar3.f38052s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.ll.o(R.string.LinkCopied, org.telegram.ui.Components.oc.a0(jzVar3.f38051r));
                    return;
                }
                return;
            case 3:
                jz jzVar4 = this.f37759b;
                if (jzVar4.f38052s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", jzVar4.f38052s);
                        jzVar4.f38051r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 4:
                jz jzVar5 = this.f37759b;
                org.telegram.ui.ActionBar.o1 o1Var2 = jzVar5.f38054x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                lz lzVar = jzVar5.A.f39948c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(jzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.S(jzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar5.getContext());
                    alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.f6.H5;
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(jzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(lzVar.f40255c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23284t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, g7.e6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new iz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new a7(jzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    vp vpVar = new vp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.setOnShowListener(vpVar);
                    c2Var.setOnDismissListener(new hz(0, editTextBoldCursor));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                jz jzVar6 = this.f37759b;
                org.telegram.ui.ActionBar.o1 o1Var3 = jzVar6.f38054x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (jzVar6.f38052s != null) {
                    org.telegram.ui.Components.wh0 wh0Var = new org.telegram.ui.Components.wh0(jzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), jzVar6.f38052s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    wh0Var.m(R.raw.qr_code_logo);
                    wh0Var.show();
                    return;
                }
                return;
            default:
                jz jzVar7 = this.f37759b;
                org.telegram.ui.ActionBar.o1 o1Var4 = jzVar7.f38054x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                lz lzVar2 = jzVar7.A.f39948c;
                tL_inputChatlistDialogFilter.filter_id = lzVar2.f40255c.f19649id;
                tL_chatlists_deleteExportedInvite.slug = lzVar2.a0();
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(jzVar7.getContext(), 3, null);
                c2Var2.q(180L);
                lzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new rc(26, jzVar7, c2Var2));
                return;
        }
    }
}
