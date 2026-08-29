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
public final class fz implements View.OnClickListener {
    public final int f38387a;
    public final lz f38388b;

    public fz(lz lzVar, int i10) {
        this.f38387a = i10;
        this.f38388b = lzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38387a) {
            case 0:
                lz lzVar = this.f38388b;
                String str = lzVar.f38700s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    b.n(R.string.LinkCopied, org.telegram.ui.Components.tc.a0(lzVar.f38699r));
                    return;
                }
                return;
            case 1:
                lz lzVar2 = this.f38388b;
                FrameLayout frameLayout = lzVar2.f38693a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    lzVar2.postDelayed(new ui(lzVar2, 29), 180L);
                }
                float[] fArr = lzVar2.f38703y;
                if (lzVar2.f38702x == null && lzVar2.f38700s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(lzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(lzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, i7.f6.n(-1, 48));
                    g1Var.setOnClickListener(new fz(lzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(lzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, i7.f6.n(-1, 48));
                    g1Var2.setOnClickListener(new fz(lzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(lzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.g6.f23279p7;
                    g1Var3.c(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new fz(lzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, i7.f6.n(-1, 48));
                    FrameLayout overlayContainerView = lzVar2.f38699r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        gz.a(frameLayout, overlayContainerView, fArr);
                        float f9 = fArr[1];
                        cg.i0 i0Var = new cg.i0(lzVar2, lzVar2.getContext(), overlayContainerView, 9);
                        vh vhVar = new vh(i0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(vhVar);
                        overlayContainerView.addView(i0Var, i7.f6.c(-1.0f, -1));
                        float f10 = 0.0f;
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        lzVar2.f38702x = o1Var;
                        o1Var.setOnDismissListener(new org.telegram.ui.Components.n80(lzVar2, i0Var, overlayContainerView, vhVar, 1));
                        lzVar2.f38702x.setOutsideTouchable(true);
                        lzVar2.f38702x.setFocusable(true);
                        lzVar2.f38702x.setBackgroundDrawable(new ColorDrawable(0));
                        lzVar2.f38702x.setAnimationStyle(R.style.PopupContextAnimation);
                        lzVar2.f38702x.setInputMethodMode(2);
                        lzVar2.f38702x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new xt(lzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f9 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        lzVar2.f38702x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f9 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                lz lzVar3 = this.f38388b;
                String str2 = lzVar3.f38700s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    b.n(R.string.LinkCopied, org.telegram.ui.Components.tc.a0(lzVar3.f38699r));
                    return;
                }
                return;
            case 3:
                lz lzVar4 = this.f38388b;
                if (lzVar4.f38700s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", lzVar4.f38700s);
                        lzVar4.f38699r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 4:
                lz lzVar5 = this.f38388b;
                org.telegram.ui.ActionBar.o1 o1Var2 = lzVar5.f38702x;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                }
                nz nzVar = lzVar5.A.f40653c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(lzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.S(lzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lzVar5.getContext());
                    alertDialog$Builder.f22714a.E = org.telegram.ui.ActionBar.g6.H5;
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(lzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(nzVar.f40931c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23345t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, i7.f6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new kz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new z6(lzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    yp ypVar = new yp(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.setOnShowListener(ypVar);
                    c2Var.setOnDismissListener(new jz(0, editTextBoldCursor));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                lz lzVar6 = this.f38388b;
                org.telegram.ui.ActionBar.o1 o1Var3 = lzVar6.f38702x;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                if (lzVar6.f38700s != null) {
                    org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(lzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), lzVar6.f38700s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    gi0Var.m(R.raw.qr_code_logo);
                    gi0Var.show();
                    return;
                }
                return;
            default:
                lz lzVar7 = this.f38388b;
                org.telegram.ui.ActionBar.o1 o1Var4 = lzVar7.f38702x;
                if (o1Var4 != null) {
                    o1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                nz nzVar2 = lzVar7.A.f40653c;
                tL_inputChatlistDialogFilter.filter_id = nzVar2.f40931c.f19620id;
                tL_chatlists_deleteExportedInvite.slug = nzVar2.b0();
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(lzVar7.getContext(), 3, null);
                c2Var2.q(180L);
                nzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new zg(22, lzVar7, c2Var2));
                return;
        }
    }
}
