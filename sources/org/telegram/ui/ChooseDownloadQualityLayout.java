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
import org.telegram.messenger.SharedConfig;
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
        void onQualitySelected(MessageObject messageObject, VideoPlayer.QualityUri qualityUri);
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

    public void lambda$update$1(MessageObject messageObject, VideoPlayer.QualityUri qualityUri, View view) {
        this.callback.onQualitySelected(messageObject, qualityUri);
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
            final VideoPlayer.QualityUri qualityUri = (VideoPlayer.QualityUri) qualities.get(i2);
            String str2 = "";
            if (SharedConfig.debugVideoQualities) {
                str = qualityUri.width + "x" + qualityUri.height;
                if (qualityUri.original) {
                    str = str + " (" + LocaleController.getString(R.string.QualityOriginal).toLowerCase() + ")";
                }
                str2 = "" + AndroidUtilities.formatFileSize((long) qualityUri.bitrate).replace(" ", "") + "/s";
                if (qualityUri.codec != null) {
                    str2 = str2 + ", " + qualityUri.codec;
                }
            } else {
                int min = Math.min(qualityUri.width, qualityUri.height);
                if (Math.abs(min - 1080) < 30) {
                    min = 1080;
                } else if (Math.abs(min - 720) < 30) {
                    min = 720;
                } else if (Math.abs(min - 360) < 30) {
                    min = 360;
                } else if (Math.abs(min - 240) < 30) {
                    min = 240;
                } else if (Math.abs(min - 144) < 30) {
                    min = 144;
                }
                str = min + "p";
            }
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(this.buttonsLayout, 0, str, false, null);
            if (!TextUtils.isEmpty(str2)) {
                addItem.setSubtext(str2);
            }
            addItem.setColors(-328966, -328966);
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChooseDownloadQualityLayout.this.lambda$update$1(messageObject, qualityUri, view);
                }
            });
            addItem.setSelectorColor(268435455);
        }
        return true;
    }
}
