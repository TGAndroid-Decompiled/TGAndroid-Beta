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
    public int f26034a;
    public org.telegram.ui.Components.t9 f26035b;
    public TextView f26036c;
    public TextView d;
    public TextView f26037e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.t9 t9Var = this.f26035b;
        int i10 = this.f26034a;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23009a7, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.f26035b.i(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
            t9Var.getImageReceiver().setAutoRepeat(2);
            return;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
        t9Var.getImageReceiver().clearImage();
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
        NotificationCenter.getInstance(this.f26034a).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f26034a).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f26036c;
        TextView textView3 = this.f26037e;
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
