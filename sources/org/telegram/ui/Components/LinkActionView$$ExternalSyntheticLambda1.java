package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class LinkActionView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final LinkActionView f$0;

    public LinkActionView$$ExternalSyntheticLambda1(LinkActionView linkActionView, int i) {
        this.$r8$classId = i;
        this.f$0 = linkActionView;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.delegate.showUsersForPermanentLink();
                break;
            case 1:
                LinkActionView linkActionView = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow = linkActionView.actionBarPopupWindow;
                if (actionBarPopupWindow != null) {
                    actionBarPopupWindow.dismiss(true);
                }
                linkActionView.delegate.editLink();
                break;
            case 2:
                final LinkActionView linkActionView2 = this.f$0;
                String str = linkActionView2.link;
                boolean z = str != null && str.endsWith("?direct");
                Context context = linkActionView2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = linkActionView2.link;
                String string2 = linkActionView2.qrText;
                if (string2 == null) {
                    string2 = LocaleController.getString(linkActionView2.isChannel ? z ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                ?? r2 = new QRCodeBottomSheet(context, string, str2, string2) {
                    public AnonymousClass6(Context context2, String string3, String str3, String string4) {
                        super(context2, string3, str3, string4, false);
                    }

                    @Override
                    public final void lambda$showGiftOfferSheet$15() {
                        super.lambda$showGiftOfferSheet$15();
                        LinkActionView.this.qrCodeBottomSheet = null;
                    }
                };
                linkActionView2.qrCodeBottomSheet = r2;
                r2.setCenterAnimation(R.raw.qr_code_logo);
                linkActionView2.qrCodeBottomSheet.show();
                ActionBarPopupWindow actionBarPopupWindow2 = linkActionView2.actionBarPopupWindow;
                if (actionBarPopupWindow2 != null) {
                    actionBarPopupWindow2.dismiss(true);
                }
                break;
            default:
                LinkActionView linkActionView3 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow3 = linkActionView3.actionBarPopupWindow;
                if (actionBarPopupWindow3 != null) {
                    actionBarPopupWindow3.dismiss(true);
                }
                BaseFragment baseFragment = linkActionView3.fragment;
                if (baseFragment.getParentActivity() != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
                    String string3 = LocaleController.getString(R.string.RevokeLink);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string3;
                    alertDialog.message = LocaleController.getString(R.string.RevokeAlert);
                    builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new LinkActionView$$ExternalSyntheticLambda9(linkActionView3, 2));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    }
                    builder.show();
                    break;
                }
                break;
        }
    }
}
