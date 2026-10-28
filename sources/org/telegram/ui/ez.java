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
    public final int f39111a;
    public final mz f39112b;

    public ez(mz mzVar, int i10) {
        this.f39111a = i10;
        this.f39112b = mzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39111a) {
            case 0:
                mz mzVar = this.f39112b;
                String str = mzVar.f39727s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.wh.m(R.string.LinkCopied, org.telegram.ui.Components.wc.b0(mzVar.f39726r));
                    return;
                }
                return;
            case 1:
                mz mzVar2 = this.f39112b;
                FrameLayout frameLayout = mzVar2.f39721a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    mzVar2.postDelayed(new xi(mzVar2, 29), 180L);
                }
                float[] fArr = mzVar2.f39730y;
                if (mzVar2.f39729x == null && mzVar2.f39727s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(mzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(mzVar2.getContext(), true, false);
                    g1Var.j(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, org.telegram.ui.Components.kb1.r(-1, 48));
                    g1Var.setOnClickListener(new ez(mzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(mzVar2.getContext(), false, false);
                    g1Var2.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, org.telegram.ui.Components.kb1.r(-1, 48));
                    g1Var2.setOnClickListener(new ez(mzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(mzVar2.getContext(), false, true);
                    g1Var3.j(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.y6.f23582p7;
                    g1Var3.c(i10, i10);
                    g1Var3.h(0.12f, i10);
                    g1Var3.setOnClickListener(new ez(mzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, org.telegram.ui.Components.kb1.r(-1, 48));
                    FrameLayout overlayContainerView = mzVar2.f39726r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        gz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        fi.f6 f6Var = new fi.f6(mzVar2, mzVar2.getContext(), overlayContainerView, 10);
                        i7 i7Var = new i7(f6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(i7Var);
                        overlayContainerView.addView(f6Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                        float f10 = 0.0f;
                        f6Var.setAlpha(0.0f);
                        f6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        mzVar2.f39729x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.o90(mzVar2, f6Var, overlayContainerView, i7Var, 1));
                        mzVar2.f39729x.setOutsideTouchable(true);
                        mzVar2.f39729x.setFocusable(true);
                        mzVar2.f39729x.setBackgroundDrawable(new ColorDrawable(0));
                        mzVar2.f39729x.setAnimationStyle(R.style.PopupContextAnimation);
                        mzVar2.f39729x.setInputMethodMode(2);
                        mzVar2.f39729x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new st(mzVar2, 10));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        mzVar2.f39729x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mz mzVar3 = this.f39112b;
                String str2 = mzVar3.f39727s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.wh.m(R.string.LinkCopied, org.telegram.ui.Components.wc.b0(mzVar3.f39726r));
                    return;
                }
                return;
            case 3:
                mz mzVar4 = this.f39112b;
                if (mzVar4.f39727s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", mzVar4.f39727s);
                        mzVar4.f39726r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                mz mzVar5 = this.f39112b;
                org.telegram.ui.ActionBar.o1 o1Var2 = mzVar5.f39729x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                oz ozVar = mzVar5.E.f41927c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(mzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.T(mzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzVar5.getContext());
                    alertDialog$Builder.f22369a.I = org.telegram.ui.ActionBar.y6.H5;
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(mzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
                    org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(ozVar.f42255c.name);
                    org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23654t5, null);
                    org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i11, null);
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.kb1.x(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new lz(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new e7(mzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    dq dqVar = new dq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.setOnShowListener(dqVar);
                    e2Var.setOnDismissListener(new jz(editTextBoldCursor, 0));
                    e2Var.show();
                    e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                mz mzVar6 = this.f39112b;
                org.telegram.ui.ActionBar.o1 o1Var3 = mzVar6.f39729x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (mzVar6.f39727s != null) {
                    org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(mzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), mzVar6.f39727s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    jj0Var.m(R.raw.qr_code_logo);
                    jj0Var.show();
                    return;
                }
                return;
            default:
                mz mzVar7 = this.f39112b;
                org.telegram.ui.ActionBar.o1 o1Var4 = mzVar7.f39729x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                oz ozVar2 = mzVar7.E.f41927c;
                tL_inputChatlistDialogFilter.filter_id = ozVar2.f42255c.f19548id;
                tL_chatlists_deleteExportedInvite.slug = ozVar2.c0();
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(mzVar7.getContext(), 3, null);
                e2Var2.r(180L);
                ozVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new z7(27, mzVar7, e2Var2));
                return;
        }
    }
}
