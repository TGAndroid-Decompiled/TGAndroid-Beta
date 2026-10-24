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
    public final int f37149a;
    public final mz f37150b;

    public ez(mz mzVar, int i10) {
        this.f37149a = i10;
        this.f37150b = mzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37149a) {
            case 0:
                mz mzVar = this.f37150b;
                String str = mzVar.f38078s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.tl.p(R.string.LinkCopied, org.telegram.ui.Components.vc.a0(mzVar.f38077r));
                    return;
                }
                return;
            case 1:
                mz mzVar2 = this.f37150b;
                FrameLayout frameLayout = mzVar2.f38072a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    mzVar2.postDelayed(new fz(mzVar2, 0), 180L);
                }
                float[] fArr = mzVar2.f38081y;
                if (mzVar2.f38080x == null && mzVar2.f38078s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(mzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(mzVar2.getContext(), true, false);
                    e1Var.j(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                    e1Var.setOnClickListener(new ez(mzVar2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(mzVar2.getContext(), false, false);
                    e1Var2.j(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                    e1Var2.setOnClickListener(new ez(mzVar2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(mzVar2.getContext(), false, true);
                    e1Var3.j(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.k6.f21405p7;
                    e1Var3.c(i10, i10);
                    e1Var3.h(0.12f, i10);
                    e1Var3.setOnClickListener(new ez(mzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    FrameLayout overlayContainerView = mzVar2.f38077r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        hz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ei.g6 g6Var = new ei.g6(mzVar2, mzVar2.getContext(), overlayContainerView, 9);
                        vh vhVar = new vh(g6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(vhVar);
                        overlayContainerView.addView(g6Var, w7.z5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        g6Var.setAlpha(0.0f);
                        g6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        mzVar2.f38080x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.l90(mzVar2, g6Var, overlayContainerView, vhVar, 1));
                        mzVar2.f38080x.setOutsideTouchable(true);
                        mzVar2.f38080x.setFocusable(true);
                        mzVar2.f38080x.setBackgroundDrawable(new ColorDrawable(0));
                        mzVar2.f38080x.setAnimationStyle(R.style.PopupContextAnimation);
                        mzVar2.f38080x.setInputMethodMode(2);
                        mzVar2.f38080x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new xt(mzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        mzVar2.f38080x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mz mzVar3 = this.f37150b;
                String str2 = mzVar3.f38078s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.tl.p(R.string.LinkCopied, org.telegram.ui.Components.vc.a0(mzVar3.f38077r));
                    return;
                }
                return;
            case 3:
                mz mzVar4 = this.f37150b;
                if (mzVar4.f38078s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", mzVar4.f38078s);
                        mzVar4.f38077r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                mz mzVar5 = this.f37150b;
                org.telegram.ui.ActionBar.m1 m1Var2 = mzVar5.f38080x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                oz ozVar = mzVar5.E.f40027c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(mzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.T(mzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzVar5.getContext());
                    alertDialog$Builder.f20679a.I = org.telegram.ui.ActionBar.k6.H5;
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new iz(editTextBoldCursor, 0));
                    LinearLayout linearLayout = new LinearLayout(mzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.o(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
                    org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i11, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(ozVar.f40282c.name);
                    org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21479t5, null);
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i11, null);
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new lz(editTextBoldCursor, 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new e7(mzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    yp ypVar = new yp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.setOnShowListener(ypVar);
                    c2Var.setOnDismissListener(new kz(editTextBoldCursor, 0));
                    c2Var.show();
                    c2Var.p(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                mz mzVar6 = this.f37150b;
                org.telegram.ui.ActionBar.m1 m1Var3 = mzVar6.f38080x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (mzVar6.f38078s != null) {
                    org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(mzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), mzVar6.f38078s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ij0Var.m(R.raw.qr_code_logo);
                    ij0Var.show();
                    return;
                }
                return;
            default:
                mz mzVar7 = this.f37150b;
                org.telegram.ui.ActionBar.m1 m1Var4 = mzVar7.f38080x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                oz ozVar2 = mzVar7.E.f40027c;
                tL_inputChatlistDialogFilter.filter_id = ozVar2.f40282c.f17862id;
                tL_chatlists_deleteExportedInvite.slug = ozVar2.b0();
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(mzVar7.getContext(), 3, null);
                c2Var2.r(180L);
                ozVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new vc(26, mzVar7, c2Var2));
                return;
        }
    }
}
