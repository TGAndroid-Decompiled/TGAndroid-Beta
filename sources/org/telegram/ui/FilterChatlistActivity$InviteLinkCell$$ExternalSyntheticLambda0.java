package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda55;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;

public final class FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final FilterChatlistActivity.InviteLinkCell f$0;

    public FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(FilterChatlistActivity.InviteLinkCell inviteLinkCell, int i) {
        this.$r8$classId = i;
        this.f$0 = inviteLinkCell;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.$r8$classId) {
            case 0:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell = this.f$0;
                String str2 = inviteLinkCell.lastUrl;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    zzkn.m(R.string.LinkCopied, BulletinFactory.of(inviteLinkCell.parentFragment));
                    break;
                }
                break;
            case 1:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell2 = this.f$0;
                FrameLayout frameLayout = inviteLinkCell2.linkBox;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    inviteLinkCell2.postDelayed(new ComposeDrawable$$ExternalSyntheticLambda0(inviteLinkCell2, 20), 180L);
                }
                if (inviteLinkCell2.actionBarPopupWindow == null && inviteLinkCell2.lastUrl != null) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(inviteLinkCell2.getContext());
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, inviteLinkCell2.getContext(), null, true, false);
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 48);
                    ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                    anonymousClass2.addView(actionBarMenuSubItem, layoutParamsCreateLinear);
                    actionBarMenuSubItem.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(inviteLinkCell2, 5));
                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, inviteLinkCell2.getContext(), null, false, false);
                    actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    anonymousClass2.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
                    actionBarMenuSubItem2.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(inviteLinkCell2, 6));
                    ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, inviteLinkCell2.getContext(), null, false, true);
                    actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i = Theme.key_text_RedRegular;
                    int color = Theme.getColor(null, i, false);
                    int color2 = Theme.getColor(null, i, false);
                    actionBarMenuSubItem3.setTextColor(color);
                    actionBarMenuSubItem3.setIconColor(color2);
                    actionBarMenuSubItem3.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i, false)));
                    actionBarMenuSubItem3.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(inviteLinkCell2, 7));
                    anonymousClass2.addView(actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
                    FrameLayout overlayContainerView = ((ActionBarLayout) inviteLinkCell2.parentFragment.getParentLayout()).getOverlayContainerView();
                    if (overlayContainerView != null) {
                        float[] fArr = inviteLinkCell2.point;
                        FilterChatlistActivity.InviteLinkCell.getPointOnScreen(frameLayout, overlayContainerView, fArr);
                        float paddingTop = fArr[1];
                        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(inviteLinkCell2, inviteLinkCell2.getContext(), overlayContainerView, 6);
                        PhotoViewer.AnonymousClass9 anonymousClass9 = new PhotoViewer.AnonymousClass9(anonymousClass27, 7);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(anonymousClass9);
                        overlayContainerView.addView(anonymousClass27, LayoutHelper.createFrame(-1.0f, -1));
                        float paddingLeft = 0.0f;
                        anonymousClass27.setAlpha(0.0f);
                        anonymousClass27.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
                        inviteLinkCell2.actionBarPopupWindow = actionBarPopupWindow;
                        actionBarPopupWindow.setOnDismissListener(new LinkActionView.AnonymousClass4(inviteLinkCell2, anonymousClass27, overlayContainerView, anonymousClass9, 1));
                        inviteLinkCell2.actionBarPopupWindow.setOutsideTouchable(true);
                        inviteLinkCell2.actionBarPopupWindow.setFocusable(true);
                        inviteLinkCell2.actionBarPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
                        inviteLinkCell2.actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        inviteLinkCell2.actionBarPopupWindow.setInputMethodMode(2);
                        inviteLinkCell2.actionBarPopupWindow.setSoftInputMode(0);
                        actionBarPopupWindowLayout.setDispatchKeyEventListener(new VideoEditTextureView$$ExternalSyntheticLambda1(inviteLinkCell2, 21));
                        if (AndroidUtilities.isTablet()) {
                            paddingTop += overlayContainerView.getPaddingTop();
                            paddingLeft = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        inviteLinkCell2.actionBarPopupWindow.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + paddingLeft), (int) (overlayContainerView.getY() + paddingTop + frameLayout.getMeasuredHeight()));
                    }
                    break;
                }
                break;
            case 2:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell3 = this.f$0;
                String str3 = inviteLinkCell3.lastUrl;
                if (str3 != null) {
                    AndroidUtilities.addToClipboard(str3);
                    zzkn.m(R.string.LinkCopied, BulletinFactory.of(inviteLinkCell3.parentFragment));
                    break;
                }
                break;
            case 3:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell4 = this.f$0;
                if (inviteLinkCell4.lastUrl != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", inviteLinkCell4.lastUrl);
                        inviteLinkCell4.parentFragment.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                    break;
                }
                break;
            case 4:
                this.f$0.getClass();
                break;
            case 5:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell5 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow2 = inviteLinkCell5.actionBarPopupWindow;
                if (actionBarPopupWindow2 != null) {
                    actionBarPopupWindow2.dismiss(true);
                }
                FilterChatlistActivity.ListAdapter.AnonymousClass1 anonymousClass1 = (FilterChatlistActivity.ListAdapter.AnonymousClass1) inviteLinkCell5;
                FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = filterChatlistActivity.invite;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(anonymousClass1.getContext());
                    editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(anonymousClass1.getContext()));
                    AlertDialog.Builder builder = new AlertDialog.Builder(anonymousClass1.getContext(), 0, null);
                    int i2 = Theme.key_dialogButton;
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.dialogButtonColorKey = i2;
                    alertDialog.title = LocaleController.getString(R.string.FilterInviteEditName);
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new GroupCallActivity$6$$ExternalSyntheticLambda2(2, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(anonymousClass1.getContext());
                    linearLayout.setOrientation(1);
                    builder.setView(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i3 = Theme.key_dialogTextBlack;
                    editTextBoldCursor.setTextColor(Theme.getColor(null, i3, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(filterChatlistActivity.filter.name);
                    editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_dialogTextHint, false));
                    editTextBoldCursor.setCursorColor(Theme.getColor(null, i3, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new GroupCallActivity$6$$ExternalSyntheticLambda3(2, builder));
                    editTextBoldCursor.addTextChangedListener(new GroupCallActivity.AnonymousClass6.AnonymousClass2(1, editTextBoldCursor));
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = filterChatlistActivity.invite;
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite2.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    builder.setPositiveButton(LocaleController.getString(R.string.Save), new VoIPFragment$$ExternalSyntheticLambda42(anonymousClass1, editTextBoldCursor, builder, 10));
                    alertDialog.setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda55(4, editTextBoldCursor));
                    alertDialog.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(2, editTextBoldCursor));
                    alertDialog.show();
                    alertDialog.setTextColor(Theme.getColor(null, i3, false));
                    editTextBoldCursor.requestFocus();
                    break;
                }
                break;
            case 6:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell6 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow3 = inviteLinkCell6.actionBarPopupWindow;
                if (actionBarPopupWindow3 != null) {
                    actionBarPopupWindow3.dismiss(true);
                }
                if (inviteLinkCell6.lastUrl != null) {
                    QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(inviteLinkCell6.getContext(), LocaleController.getString(R.string.InviteByQRCode), inviteLinkCell6.lastUrl, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
                    qRCodeBottomSheet.show();
                    break;
                }
                break;
            default:
                FilterChatlistActivity.InviteLinkCell inviteLinkCell7 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow4 = inviteLinkCell7.actionBarPopupWindow;
                if (actionBarPopupWindow4 != null) {
                    actionBarPopupWindow4.dismiss(true);
                }
                FilterChatlistActivity.ListAdapter.AnonymousClass1 anonymousClass3 = (FilterChatlistActivity.ListAdapter.AnonymousClass1) inviteLinkCell7;
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                FilterChatlistActivity filterChatlistActivity2 = FilterChatlistActivity.this;
                tL_inputChatlistDialogFilter.filter_id = filterChatlistActivity2.filter.id;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = filterChatlistActivity2.invite;
                tL_chatlists_deleteExportedInvite.slug = (tL_exportedChatlistInvite3 == null || (str = tL_exportedChatlistInvite3.url) == null) ? null : str.substring(str.lastIndexOf(47) + 1);
                AlertDialog alertDialog2 = new AlertDialog(anonymousClass3.getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 180L);
                filterChatlistActivity2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new LinkManager$$ExternalSyntheticLambda8(13, anonymousClass3, alertDialog2));
                break;
        }
    }
}
