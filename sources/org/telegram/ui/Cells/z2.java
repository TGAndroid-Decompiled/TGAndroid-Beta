package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

public abstract class z2 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {

    public int f26018a;

    public org.telegram.ui.Components.n9 f26019b;

    public TextView f26020c;
    public TextView d;

    public TextView f26021e;

    public final void a() {
        org.telegram.ui.Components.n9 n9Var = this.f26019b;
        int i10 = this.f26018a;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        TLRPC.Document document = (tL_messages_stickerSet == null || 1 >= tL_messages_stickerSet.documents.size()) ? null : tL_messages_stickerSet.documents.get(1);
        if (document == null) {
            MediaDataController.getInstance(i10).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            n9Var.getImageReceiver().clearImage();
            return;
        }
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 0.2f);
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        this.f26019b.i(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
        n9Var.getImageReceiver().setAutoRepeat(2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f26018a).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f26018a).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f26020c;
        TextView textView3 = this.f26021e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
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
}
