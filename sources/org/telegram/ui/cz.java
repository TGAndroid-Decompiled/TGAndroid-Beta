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
public final class cz implements View.OnClickListener {
    public final int f38697a;
    public final jz f38698b;

    public cz(jz jzVar, int i10) {
        this.f38697a = i10;
        this.f38698b = jzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38697a) {
            case 0:
                jz jzVar = this.f38698b;
                String str = jzVar.f39214s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.vh.m(R.string.LinkCopied, org.telegram.ui.Components.wc.b0(jzVar.f39213r));
                    return;
                }
                return;
            case 1:
                jz jzVar2 = this.f38698b;
                FrameLayout frameLayout = jzVar2.f39208a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    jzVar2.postDelayed(new ui(jzVar2, 29), 180L);
                }
                float[] fArr = jzVar2.f39217y;
                if (jzVar2.f39216x == null && jzVar2.f39214s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(jzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(jzVar2.getContext(), true, false);
                    g1Var.j(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, org.telegram.ui.Components.gb1.r(-1, 48));
                    g1Var.setOnClickListener(new cz(jzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(jzVar2.getContext(), false, false);
                    g1Var2.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, org.telegram.ui.Components.gb1.r(-1, 48));
                    g1Var2.setOnClickListener(new cz(jzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(jzVar2.getContext(), false, true);
                    g1Var3.j(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.y6.f23579p7;
                    g1Var3.c(i10, i10);
                    g1Var3.h(0.12f, i10);
                    g1Var3.setOnClickListener(new cz(jzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, org.telegram.ui.Components.gb1.r(-1, 48));
                    FrameLayout overlayContainerView = jzVar2.f39213r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        ez.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        fi.f6 f6Var = new fi.f6(jzVar2, jzVar2.getContext(), overlayContainerView, 10);
                        i7 i7Var = new i7(f6Var, 2);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(i7Var);
                        overlayContainerView.addView(f6Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                        float f10 = 0.0f;
                        f6Var.setAlpha(0.0f);
                        f6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        jzVar2.f39216x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.n90(jzVar2, f6Var, overlayContainerView, i7Var, 1));
                        jzVar2.f39216x.setOutsideTouchable(true);
                        jzVar2.f39216x.setFocusable(true);
                        jzVar2.f39216x.setBackgroundDrawable(new ColorDrawable(0));
                        jzVar2.f39216x.setAnimationStyle(R.style.PopupContextAnimation);
                        jzVar2.f39216x.setInputMethodMode(2);
                        jzVar2.f39216x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new qt(jzVar2, 10));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        jzVar2.f39216x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                jz jzVar3 = this.f38698b;
                String str2 = jzVar3.f39214s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.vh.m(R.string.LinkCopied, org.telegram.ui.Components.wc.b0(jzVar3.f39213r));
                    return;
                }
                return;
            case 3:
                jz jzVar4 = this.f38698b;
                if (jzVar4.f39214s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", jzVar4.f39214s);
                        jzVar4.f39213r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                jz jzVar5 = this.f38698b;
                org.telegram.ui.ActionBar.o1 o1Var2 = jzVar5.f39216x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                lz lzVar = jzVar5.E.f41088c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(jzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.T(jzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar5.getContext());
                    alertDialog$Builder.f22366a.I = org.telegram.ui.ActionBar.y6.H5;
                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fz(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(jzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.y6.f23462j5;
                    org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(lzVar.f41402c.name);
                    org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23651t5, null);
                    org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i11, null);
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.gb1.x(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new iz(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new e7(jzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    bq bqVar = new bq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.setOnShowListener(bqVar);
                    e2Var.setOnDismissListener(new hz(editTextBoldCursor, 0));
                    e2Var.show();
                    e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                jz jzVar6 = this.f38698b;
                org.telegram.ui.ActionBar.o1 o1Var3 = jzVar6.f39216x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (jzVar6.f39214s != null) {
                    org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(jzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), jzVar6.f39214s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ij0Var.m(R.raw.qr_code_logo);
                    ij0Var.show();
                    return;
                }
                return;
            default:
                jz jzVar7 = this.f38698b;
                org.telegram.ui.ActionBar.o1 o1Var4 = jzVar7.f39216x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                lz lzVar2 = jzVar7.E.f41088c;
                tL_inputChatlistDialogFilter.filter_id = lzVar2.f41402c.f19549id;
                tL_chatlists_deleteExportedInvite.slug = lzVar2.c0();
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(jzVar7.getContext(), 3, null);
                e2Var2.r(180L);
                lzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new z7(27, jzVar7, e2Var2));
                return;
        }
    }
}
