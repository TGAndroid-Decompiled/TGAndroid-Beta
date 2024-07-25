package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$RequestPeerType;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeBroadcast;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeChat;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
public class DialogsRequestedEmptyCell extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    TextView buttonView;
    int currentAccount;
    BackupImageView stickerView;
    TextView subtitleView;
    TextView titleView;

    protected void onButtonClick() {
    }

    public DialogsRequestedEmptyCell(Context context) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        LinearLayout linearLayout = new LinearLayout(this, context) {
            Paint paint;
            Path path = new Path();

            {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                canvas.drawPath(this.path, this.paint);
                super.onDraw(canvas);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                this.path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            }
        };
        linearLayout.setWillNotDraw(false);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerView = backupImageView;
        backupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DialogsRequestedEmptyCell.this.lambda$new$0(view);
            }
        });
        updateSticker();
        linearLayout.addView(this.stickerView, LayoutHelper.createLinear(130, 130, 49));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setGravity(17);
        this.titleView.setTextSize(1, 18.0f);
        this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.titleView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(this.titleView, LayoutHelper.createLinear(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setGravity(17);
        this.subtitleView.setTextSize(1, 14.0f);
        this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
        linearLayout.addView(this.subtitleView, LayoutHelper.createLinear(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.buttonView = textView3;
        textView3.setGravity(17);
        this.buttonView.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, 8.0f));
        this.buttonView.setTextSize(1, 14.0f);
        this.buttonView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.buttonView.setTypeface(AndroidUtilities.bold());
        this.buttonView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        this.buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DialogsRequestedEmptyCell.this.lambda$new$1(view);
            }
        });
        linearLayout.addView(this.buttonView, LayoutHelper.createLinear(-1, -2, 49, 0, 18, 0, 0));
        addView(linearLayout, LayoutHelper.createLinear(-1, -2));
        set(null);
    }

    public void lambda$new$0(View view) {
        this.stickerView.getImageReceiver().startAnimation();
    }

    public void lambda$new$1(View view) {
        onButtonClick();
    }

    public void set(TLRPC$RequestPeerType tLRPC$RequestPeerType) {
        if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeBroadcast) {
            this.titleView.setText(LocaleController.getString("NoSuchChannels", R.string.NoSuchChannels));
            this.subtitleView.setText(LocaleController.getString("NoSuchChannelsInfo", R.string.NoSuchChannelsInfo));
            this.buttonView.setVisibility(0);
            this.buttonView.setText(LocaleController.getString("CreateChannelForThis", R.string.CreateChannelForThis));
        } else if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeChat) {
            this.titleView.setText(LocaleController.getString("NoSuchGroups", R.string.NoSuchGroups));
            this.subtitleView.setText(LocaleController.getString("NoSuchGroupsInfo", R.string.NoSuchGroupsInfo));
            this.buttonView.setVisibility(0);
            this.buttonView.setText(LocaleController.getString("CreateGroupForThis", R.string.CreateGroupForThis));
        } else {
            this.titleView.setText(LocaleController.getString("NoSuchUsers", R.string.NoSuchUsers));
            this.subtitleView.setText(LocaleController.getString("NoSuchUsersInfo", R.string.NoSuchUsersInfo));
            this.buttonView.setVisibility(8);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.diceStickersDidLoad && AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME.equals((String) objArr[0]) && getVisibility() == 0) {
            updateSticker();
        }
    }

    private void updateSticker() {
        TLRPC$TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
        }
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSetByName;
        TLRPC$Document tLRPC$Document = (tLRPC$TL_messages_stickerSet == null || 1 >= tLRPC$TL_messages_stickerSet.documents.size()) ? null : tLRPC$TL_messages_stickerSet.documents.get(1);
        if (tLRPC$Document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document.thumbs, Theme.key_windowBackgroundGray, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
            }
            this.stickerView.setImage(ImageLocation.getForDocument(tLRPC$Document), "130_130", "tgs", svgThumb, tLRPC$TL_messages_stickerSet);
            this.stickerView.getImageReceiver().setAutoRepeat(2);
            return;
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, tLRPC$TL_messages_stickerSet == null);
        this.stickerView.getImageReceiver().clearImage();
    }
}
