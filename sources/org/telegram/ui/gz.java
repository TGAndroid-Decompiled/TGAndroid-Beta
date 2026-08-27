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

public final class gz implements View.OnClickListener {

    public final int f38627a;

    public final mz f38628b;

    public gz(mz mzVar, int i10) {
        this.f38627a = i10;
        this.f38628b = mzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38627a) {
            case 0:
                mz mzVar = this.f38628b;
                String str = mzVar.f38919s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.rl.m(R.string.LinkCopied, org.telegram.ui.Components.mc.a0(mzVar.f38918r));
                    break;
                }
                break;
            case 1:
                mz mzVar2 = this.f38628b;
                FrameLayout frameLayout = mzVar2.f38912a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    mzVar2.postDelayed(new ti(mzVar2, 29), 180L);
                }
                float[] fArr = mzVar2.f38922y;
                if (mzVar2.f38921x == null && mzVar2.f38919s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(mzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(mzVar2.getContext(), true, false);
                    f1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, h7.z5.n(-1, 48));
                    f1Var.setOnClickListener(new gz(mzVar2, 4));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(mzVar2.getContext(), false, false);
                    f1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, h7.z5.n(-1, 48));
                    f1Var2.setOnClickListener(new gz(mzVar2, 5));
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(mzVar2.getContext(), false, true);
                    f1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.g6.f23269p7;
                    f1Var3.c(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    f1Var3.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
                    f1Var3.setOnClickListener(new gz(mzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, h7.z5.n(-1, 48));
                    FrameLayout overlayContainerView = mzVar2.f38918r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        hz.a(frameLayout, overlayContainerView, fArr);
                        float paddingTop = fArr[1];
                        ag.t0 t0Var = new ag.t0(mzVar2, mzVar2.getContext(), overlayContainerView, 10);
                        uh uhVar = new uh(t0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(uhVar);
                        overlayContainerView.addView(t0Var, h7.z5.c(-1.0f, -1));
                        float paddingLeft = 0.0f;
                        t0Var.setAlpha(0.0f);
                        t0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        mzVar2.f38921x = n1Var;
                        n1Var.setOnDismissListener(new org.telegram.ui.Components.e80(mzVar2, t0Var, overlayContainerView, uhVar, 1));
                        mzVar2.f38921x.setOutsideTouchable(true);
                        mzVar2.f38921x.setFocusable(true);
                        mzVar2.f38921x.setBackgroundDrawable(new ColorDrawable(0));
                        mzVar2.f38921x.setAnimationStyle(R.style.PopupContextAnimation);
                        mzVar2.f38921x.setInputMethodMode(2);
                        mzVar2.f38921x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new zt(mzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            paddingTop += overlayContainerView.getPaddingTop();
                            paddingLeft = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        mzVar2.f38921x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + paddingLeft), (int) (overlayContainerView.getY() + paddingTop + frameLayout.getMeasuredHeight()));
                    }
                    break;
                }
                break;
            case 2:
                mz mzVar3 = this.f38628b;
                String str2 = mzVar3.f38919s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.rl.m(R.string.LinkCopied, org.telegram.ui.Components.mc.a0(mzVar3.f38918r));
                    break;
                }
                break;
            case 3:
                mz mzVar4 = this.f38628b;
                if (mzVar4.f38919s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", mzVar4.f38919s);
                        mzVar4.f38918r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                    break;
                }
                break;
            case 4:
                mz mzVar5 = this.f38628b;
                org.telegram.ui.ActionBar.n1 n1Var2 = mzVar5.f38921x;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                }
                oz ozVar = mzVar5.A.f40959c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(mzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.S(mzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzVar5.getContext());
                    alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.g6.H5;
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new iz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(mzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(ozVar.f41218c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23338t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                    int i12 = 0;
                    editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder, i12));
                    editTextBoldCursor.addTextChangedListener(new lz(i12, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new b7(mzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    xp xpVar = new xp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.setOnShowListener(xpVar);
                    b2Var.setOnDismissListener(new kz(0, editTextBoldCursor));
                    b2Var.show();
                    b2Var.o(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 5:
                mz mzVar6 = this.f38628b;
                org.telegram.ui.ActionBar.n1 n1Var3 = mzVar6.f38921x;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                if (mzVar6.f38919s != null) {
                    org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(mzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), mzVar6.f38919s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    yh0Var.m(R.raw.qr_code_logo);
                    yh0Var.show();
                    break;
                }
                break;
            default:
                mz mzVar7 = this.f38628b;
                org.telegram.ui.ActionBar.n1 n1Var4 = mzVar7.f38921x;
                if (n1Var4 != null) {
                    n1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                oz ozVar2 = mzVar7.A.f40959c;
                tL_inputChatlistDialogFilter.filter_id = ozVar2.f41218c.f19622id;
                tL_chatlists_deleteExportedInvite.slug = ozVar2.b0();
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(mzVar7.getContext(), 3, null);
                b2Var2.q(180L);
                ozVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new gg(23, mzVar7, b2Var2));
                break;
        }
    }
}
