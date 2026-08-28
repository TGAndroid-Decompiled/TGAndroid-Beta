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
public abstract class b3 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public int f24126a;
    public org.telegram.ui.Components.o9 f24127b;
    public TextView f24128c;
    public TextView d;
    public TextView f24129e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.o9 o9Var = this.f24127b;
        int i9 = this.f24126a;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i9).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f22947a7, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.f24127b.i(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
            o9Var.getImageReceiver().setAutoRepeat(2);
            return;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i9);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
        o9Var.getImageReceiver().clearImage();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f24126a).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24126a).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f24128c;
        TextView textView3 = this.f24129e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(LocaleController.getString(R.string.NoSuchChannels));
            textView.setText(LocaleController.getString(R.string.NoSuchChannelsInfo));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CreateChannelForThis));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(LocaleController.getString(R.string.NoSuchGroups));
            textView.setText(LocaleController.getString(R.string.NoSuchGroupsInfo));
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.CreateGroupForThis));
        } else {
            textView2.setText(LocaleController.getString(R.string.NoSuchUsers));
            textView.setText(LocaleController.getString(R.string.NoSuchUsersInfo));
            textView3.setVisibility(8);
        }
    }
}
