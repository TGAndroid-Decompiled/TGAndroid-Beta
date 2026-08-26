package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.PhotoViewer;

public final class ShareAlert$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final ShareAlert f$0;

    public ShareAlert$$ExternalSyntheticLambda3(ShareAlert shareAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = shareAlert;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ShareAlert shareAlert = this.f$0;
                if (shareAlert.selectedDialogs.size() == 0) {
                    boolean z = shareAlert.isChannel;
                    String[] strArr = shareAlert.linkToCopy;
                    if (z || strArr[0] != null) {
                        shareAlert.lambda$showGiftOfferSheet$15();
                        PhotoViewer.getInstance().closePhoto(true, false);
                        if (strArr[0] == null && shareAlert.loadingLink) {
                            shareAlert.copyLinkOnEnd = true;
                            Toast.makeText(shareAlert.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                        } else {
                            shareAlert.getContext();
                            shareAlert.copyLink();
                        }
                    }
                }
                break;
            case 1:
                ShareAlert shareAlert2 = this.f$0;
                CheckBoxBase checkBoxBase = shareAlert2.timestampCheckbox.checkBoxBase;
                checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                shareAlert2.updateLinkTextView();
                break;
            case 2:
                ShareAlert shareAlert3 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow = shareAlert3.sendPopupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    shareAlert3.sendPopupWindow.dismiss(true);
                }
                shareAlert3.sendInternal(false);
                break;
            case 3:
                ShareAlert shareAlert4 = this.f$0;
                ActionBarPopupWindow actionBarPopupWindow2 = shareAlert4.sendPopupWindow;
                if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                    shareAlert4.sendPopupWindow.dismiss(true);
                }
                shareAlert4.sendInternal(true);
                break;
            case 4:
                ShareAlert shareAlert5 = this.f$0;
                if (shareAlert5.selectedDialogs.size() == 0) {
                    boolean z2 = shareAlert5.isChannel;
                    String[] strArr2 = shareAlert5.linkToCopy;
                    if (z2 || strArr2[0] != null) {
                        shareAlert5.lambda$showGiftOfferSheet$15();
                        if (strArr2[0] == null && shareAlert5.loadingLink) {
                            shareAlert5.copyLinkOnEnd = true;
                            Toast.makeText(shareAlert5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                        } else {
                            shareAlert5.getContext();
                            shareAlert5.copyLink();
                        }
                    }
                }
                break;
            case 5:
                ShareAlert shareAlert6 = this.f$0;
                if (shareAlert6.selectedDialogs.size() == 0) {
                    boolean z3 = shareAlert6.isChannel;
                    String[] strArr3 = shareAlert6.linkToCopy;
                    if (z3 || strArr3[0] != null) {
                        shareAlert6.lambda$showGiftOfferSheet$15();
                        if (strArr3[0] == null && shareAlert6.loadingLink) {
                            shareAlert6.copyLinkOnEnd = true;
                            Toast.makeText(shareAlert6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                        } else {
                            shareAlert6.getContext();
                            shareAlert6.copyLink();
                        }
                    }
                }
                break;
            default:
                this.f$0.sendInternal(true);
                break;
        }
    }
}
