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
    public final int f36226a;
    public final jz f36227b;

    public cz(jz jzVar, int i10) {
        this.f36226a = i10;
        this.f36227b = jzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36226a) {
            case 0:
                jz jzVar = this.f36227b;
                String str = jzVar.f36836s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.lk.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(jzVar.f36835r));
                    return;
                }
                return;
            case 1:
                jz jzVar2 = this.f36227b;
                FrameLayout frameLayout = jzVar2.f36830a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    jzVar2.postDelayed(new dz(jzVar2, 0), 180L);
                }
                float[] fArr = jzVar2.f36839y;
                if (jzVar2.f36838x == null && jzVar2.f36836s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(jzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(jzVar2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
                    e1Var.setOnClickListener(new cz(jzVar2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(jzVar2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
                    e1Var2.setOnClickListener(new cz(jzVar2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(jzVar2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.f21210p7;
                    e1Var3.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
                    e1Var3.setOnClickListener(new cz(jzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.z5.n(-1, 48));
                    FrameLayout overlayContainerView = jzVar2.f36835r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        ez.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ei.g6 g6Var = new ei.g6(jzVar2, jzVar2.getContext(), overlayContainerView, 9);
                        vh vhVar = new vh(g6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(vhVar);
                        overlayContainerView.addView(g6Var, w7.z5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        g6Var.setAlpha(0.0f);
                        g6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        jzVar2.f36838x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.m90(jzVar2, g6Var, overlayContainerView, vhVar, 1));
                        jzVar2.f36838x.setOutsideTouchable(true);
                        jzVar2.f36838x.setFocusable(true);
                        jzVar2.f36838x.setBackgroundDrawable(new ColorDrawable(0));
                        jzVar2.f36838x.setAnimationStyle(R.style.PopupContextAnimation);
                        jzVar2.f36838x.setInputMethodMode(2);
                        jzVar2.f36838x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ut(jzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        jzVar2.f36838x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                jz jzVar3 = this.f36227b;
                String str2 = jzVar3.f36836s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.lk.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(jzVar3.f36835r));
                    return;
                }
                return;
            case 3:
                jz jzVar4 = this.f36227b;
                if (jzVar4.f36836s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", jzVar4.f36836s);
                        jzVar4.f36835r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                jz jzVar5 = this.f36227b;
                org.telegram.ui.ActionBar.m1 m1Var2 = jzVar5.f36838x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                lz lzVar = jzVar5.E.f38694c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(jzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(jzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar5.getContext());
                    alertDialog$Builder.f20604a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(jzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.f21095j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(lzVar.f39085c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21284t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new iz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new e7(jzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    wp wpVar = new wp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                    b2Var.setOnShowListener(wpVar);
                    b2Var.setOnDismissListener(new hz(0, editTextBoldCursor));
                    b2Var.show();
                    b2Var.p(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                jz jzVar6 = this.f36227b;
                org.telegram.ui.ActionBar.m1 m1Var3 = jzVar6.f36838x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (jzVar6.f36836s != null) {
                    org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(jzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), jzVar6.f36836s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    fj0Var.n(R.raw.qr_code_logo);
                    fj0Var.show();
                    return;
                }
                return;
            default:
                jz jzVar7 = this.f36227b;
                org.telegram.ui.ActionBar.m1 m1Var4 = jzVar7.f36838x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                lz lzVar2 = jzVar7.E.f38694c;
                tL_inputChatlistDialogFilter.filter_id = lzVar2.f39085c.f17801id;
                tL_chatlists_deleteExportedInvite.slug = lzVar2.b0();
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(jzVar7.getContext(), 3, null);
                b2Var2.r(180L);
                lzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new vc(26, jzVar7, b2Var2));
                return;
        }
    }
}
