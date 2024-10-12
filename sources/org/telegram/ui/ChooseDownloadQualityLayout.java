package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.Components.VideoPlayer;

public class ChooseDownloadQualityLayout {
    public final LinearLayout buttonsLayout;
    private final Callback callback;
    public final ActionBarPopupWindow.ActionBarPopupWindowLayout layout;

    public interface Callback {
        void onQualitySelected(MessageObject messageObject, VideoPlayer.Quality quality);
    }

    public ChooseDownloadQualityLayout(Context context, final PopupSwipeBackLayout popupSwipeBackLayout, Callback callback) {
        this.callback = callback;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, 0, null);
        this.layout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setFitItems(true);
        ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PopupSwipeBackLayout.this.closeForeground();
            }
        });
        addItem.setColors(-328966, -328966);
        addItem.setSelectorColor(268435455);
        View view = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
            }
        };
        view.setMinimumWidth(AndroidUtilities.dp(196.0f));
        view.setBackgroundColor(-15198184);
        actionBarPopupWindowLayout.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        view.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindowLayout.addView(linearLayout);
    }

    public void lambda$update$1(MessageObject messageObject, VideoPlayer.Quality quality, View view) {
        this.callback.onQualitySelected(messageObject, quality);
    }

    public boolean update(final MessageObject messageObject) {
        TLRPC.Message message;
        String str;
        if (messageObject == null || (message = messageObject.messageOwner) == null || message.media == null || !messageObject.hasVideoQualities()) {
            return false;
        }
        int i = messageObject.currentAccount;
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        ArrayList qualities = VideoPlayer.getQualities(i, messageMedia.document, messageMedia.alt_documents, 0, false);
        this.buttonsLayout.removeAllViews();
        for (int i2 = 0; i2 < qualities.size(); i2++) {
            final VideoPlayer.Quality quality = (VideoPlayer.Quality) qualities.get(i2);
            String quality2 = quality.toString();
            if (quality2.contains("\n")) {
                String substring = quality2.substring(0, quality2.indexOf("\n"));
                str = quality2.substring(quality2.indexOf("\n") + 1);
                quality2 = substring;
            } else {
                str = "";
            }
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.buttonsLayout, 0, quality2, false, null);
            if (!TextUtils.isEmpty(str)) {
                addItem.setSubtext(str);
            }
            addItem.setColors(-328966, -328966);
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChooseDownloadQualityLayout.this.lambda$update$1(messageObject, quality, view);
                }
            });
            addItem.setSelectorColor(268435455);
        }
        return true;
    }
}
