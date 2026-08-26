package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public abstract class DialogsRequestedEmptyCell extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final TextView buttonView;
    public final int currentAccount;
    public final BackupImageView stickerView;
    public final TextView subtitleView;
    public final TextView titleView;

    public DialogsRequestedEmptyCell(Context context) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        final int i = 1;
        setOrientation(1);
        final int i2 = 0;
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FloatingToolbar.AnonymousClass2 anonymousClass2 = new FloatingToolbar.AnonymousClass2(context, 2);
        anonymousClass2.setWillNotDraw(false);
        anonymousClass2.setOrientation(1);
        anonymousClass2.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerView = backupImageView;
        final DialogsAdapter.AnonymousClass3 anonymousClass3 = (DialogsAdapter.AnonymousClass3) this;
        backupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        anonymousClass3.stickerView.getImageReceiver().startAnimation();
                        break;
                    default:
                        DialogsAdapter.this.onCreateGroupForThisClick();
                        break;
                }
            }
        });
        updateSticker();
        anonymousClass2.addView(backupImageView, LayoutHelper.createLinear(130, 130, 49));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setTypeface(AndroidUtilities.bold());
        anonymousClass2.addView(textView, LayoutHelper.createLinear(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        anonymousClass2.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.buttonView = textView3;
        textView3.setGravity(17);
        textView3.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        anonymousClass3.stickerView.getImageReceiver().startAnimation();
                        break;
                    default:
                        DialogsAdapter.this.onCreateGroupForThisClick();
                        break;
                }
            }
        });
        anonymousClass2.addView(textView3, LayoutHelper.createLinear(-1, -2, 49, 0, 18, 0, 0));
        addView(anonymousClass2, LayoutHelper.createLinear(-1, -2));
        set(null);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            updateSticker();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        boolean z = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
        TextView textView = this.subtitleView;
        TextView textView2 = this.titleView;
        TextView textView3 = this.buttonView;
        if (z) {
            textView2.setText(LocaleController.getString(R.string.NoSuchChannels));
            textView.setText(LocaleController.getString(R.string.NoSuchChannelsInfo));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CreateChannelForThis));
            return;
        }
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) {
            textView2.setText(LocaleController.getString(R.string.NoSuchUsers));
            textView.setText(LocaleController.getString(R.string.NoSuchUsersInfo));
            textView3.setVisibility(8);
        } else {
            textView2.setText(LocaleController.getString(R.string.NoSuchGroups));
            textView.setText(LocaleController.getString(R.string.NoSuchGroupsInfo));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CreateGroupForThis));
        }
    }

    public final void updateSticker() {
        int i = this.currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        BackupImageView backupImageView = this.stickerView;
        if (document == null) {
            MediaDataController.getInstance(i).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            backupImageView.getImageReceiver().clearImage();
            return;
        }
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundGray, 0.2f);
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        this.stickerView.setImage(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
        backupImageView.getImageReceiver().setAutoRepeat(2);
    }
}
