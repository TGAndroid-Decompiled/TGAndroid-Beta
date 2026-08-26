package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;

public final class PhotoViewer$$ExternalSyntheticLambda18 implements ViewSwitcher.ViewFactory {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda18(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final View makeView() {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                photoViewer.getClass();
                return new PhotoViewer.CaptionTextView(photoViewer.activityContext, photoViewer.captionScrollView, photoViewer.textSelectionHelper, new PhotoViewer$$ExternalSyntheticLambda38(photoViewer, 1), new PhotoViewer$$ExternalSyntheticLambda142(photoViewer, 0));
            case 1:
                TextView textView = new TextView((Context) this.f$0);
                textView.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView;
            case 2:
                TextView textView2 = new TextView((Context) this.f$0);
                textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                textView2.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
                return textView2;
            default:
                TextView textView3 = new TextView((Context) this.f$0);
                zzkr.m(Theme.key_windowBackgroundWhiteGrayText6, textView3, 1);
                textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView3.setTextSize(1, 15.0f);
                return textView3;
        }
    }
}
