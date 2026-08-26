package org.telegram.ui.iv;

import com.stripe.android.Stripe;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

public final class RichCaptionController$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final int f$5;

    public RichCaptionController$1$$ExternalSyntheticLambda0(Stripe stripe, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, RichCaptionController.Host host, int i2) {
        this.f$0 = stripe;
        this.f$1 = richEditText;
        this.f$2 = i;
        this.f$3 = articleTextSelectionHelper;
        this.f$4 = host;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Stripe stripe = (Stripe) this.f$0;
                stripe.getClass();
                RichEditText richEditText = (RichEditText) this.f$1;
                int length = richEditText.length();
                int i = this.f$2;
                if (length >= i && richEditText.getSelectionStart() != richEditText.getSelectionEnd()) {
                    if (((TextSelectionHelper.ArticleTextSelectionHelper) this.f$3).selectRangeOf(((RichCaptionController.Host) this.f$4).cell(), 0, this.f$5, i)) {
                        RichCaptionController richCaptionController = (RichCaptionController) stripe.defaultPublishableKey;
                        richCaptionController.hijackingSelection = true;
                        richEditText.setSelection(i);
                        richCaptionController.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 1:
                ((ChatAttachAlertContactsLayout.ShareSearchAdapter) this.f$0).lambda$processSearch$1((String) this.f$1, (ArrayList) this.f$3, (ArrayList) this.f$4, this.f$2, this.f$5);
                break;
            default:
                ((ChatAttachAlertPhotoLayout) this.f$0).lambda$new$2(this.f$2, (BaseFragment) this.f$1, (ArrayList) this.f$3, this.f$5, (ChatActivity) this.f$4);
                break;
        }
    }

    public RichCaptionController$1$$ExternalSyntheticLambda0(ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.f$0 = shareSearchAdapter;
        this.f$1 = str;
        this.f$3 = arrayList;
        this.f$4 = arrayList2;
        this.f$2 = i;
        this.f$5 = i2;
    }

    public RichCaptionController$1$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, BaseFragment baseFragment, ArrayList arrayList, int i2, ChatActivity chatActivity) {
        this.f$0 = chatAttachAlertPhotoLayout;
        this.f$2 = i;
        this.f$1 = baseFragment;
        this.f$3 = arrayList;
        this.f$5 = i2;
        this.f$4 = chatActivity;
    }
}
