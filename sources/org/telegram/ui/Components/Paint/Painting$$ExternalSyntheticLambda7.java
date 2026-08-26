package org.telegram.ui.Components.Paint;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda16;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsChannelsAdapter;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.UniversalAdapter;

public final class Painting$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final boolean f$3;
    public final Object f$4;

    public Painting$$ExternalSyntheticLambda7(MessagesController messagesController, TLRPC.Chat chat, boolean z, int i, Consumer consumer) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$1 = chat;
        this.f$3 = z;
        this.f$2 = i;
        this.f$4 = consumer;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.$r8$classId) {
            case 0:
                Painting painting = (Painting) this.f$0;
                boolean z = this.f$3;
                painting.commitPathInternal((Path) this.f$1, this.f$2, z ? painting.activeStrokeBounds : null);
                if (z) {
                    painting.activeStrokeBounds = null;
                }
                Input$$ExternalSyntheticLambda2 input$$ExternalSyntheticLambda2 = (Input$$ExternalSyntheticLambda2) this.f$4;
                if (input$$ExternalSyntheticLambda2 != null) {
                    input$$ExternalSyntheticLambda2.run();
                }
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$startShortPoll$333((TLRPC.Chat) this.f$1, this.f$3, this.f$2, (Consumer) this.f$4);
                break;
            case 2:
                ((DialogsBotsAdapter) this.f$0).lambda$searchMessages$3(this.f$2, (TLRPC.TL_messages_searchGlobal) this.f$1, this.f$3, (TLObject) this.f$4);
                break;
            case 3:
                ((DialogsChannelsAdapter) this.f$0).lambda$searchMessages$0(this.f$2, (TLRPC.TL_messages_searchGlobal) this.f$1, this.f$3, (TLObject) this.f$4);
                break;
            default:
                boolean z2 = this.f$3;
                int i = this.f$2;
                if (!z2) {
                    str = UserConfig.getInstance(i).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i).checkPremiumGiftStickers();
                    }
                } else {
                    str = UserConfig.getInstance(i).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i).checkTonGiftStickers();
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                if (tL_messages_stickerSet != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i2);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, (String) this.f$0) || tL_stickerPack.documents.isEmpty()) {
                                i2++;
                            } else {
                                long jLongValue = tL_stickerPack.documents.get(0).longValue();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < tL_messages_stickerSet.documents.size()) {
                                        document = tL_messages_stickerSet.documents.get(i3);
                                        if (document == null || document.id != jLongValue) {
                                            i3++;
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                    }
                    if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                        document = tL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document == null) {
                    MediaDataController.getInstance(i).loadStickersByEmojiOrName(str, false, tL_messages_stickerSet == null);
                } else {
                    ImageReceiver imageReceiver = (ImageReceiver) this.f$1;
                    imageReceiver.setAllowStartLottieAnimation(true);
                    final boolean[] zArr = (boolean[]) this.f$4;
                    imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                        public final boolean[] val$played;

                        public AnonymousClass7() {
                            zArr = zArr;
                        }

                        @Override
                        public final void didSetImage(ImageReceiver imageReceiver2, boolean z3, boolean z4, boolean z5) {
                            RLottieDrawable lottieAnimation;
                            if (!z3 || (lottieAnimation = imageReceiver2.getLottieAnimation()) == null) {
                                return;
                            }
                            boolean[] zArr2 = zArr;
                            if (zArr2[0]) {
                                return;
                            }
                            lottieAnimation.setCurrentFrame(0, false);
                            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda16(lottieAnimation, 0));
                            zArr2[0] = true;
                        }

                        @Override
                        public final void didSetImageBitmap(int i4, String str2, Drawable drawable) {
                            ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i4, str2, drawable);
                        }

                        @Override
                        public final void onAnimationReady(ImageReceiver imageReceiver2) {
                            ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
                        }
                    });
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                }
                break;
        }
    }

    public Painting$$ExternalSyntheticLambda7(Painting painting, Path path, int i, boolean z, Input$$ExternalSyntheticLambda2 input$$ExternalSyntheticLambda2) {
        this.$r8$classId = 0;
        this.f$0 = painting;
        this.f$1 = path;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = input$$ExternalSyntheticLambda2;
    }

    public Painting$$ExternalSyntheticLambda7(UniversalAdapter universalAdapter, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, int i2) {
        this.$r8$classId = i2;
        this.f$0 = universalAdapter;
        this.f$2 = i;
        this.f$1 = tL_messages_searchGlobal;
        this.f$3 = z;
        this.f$4 = tLObject;
    }

    public Painting$$ExternalSyntheticLambda7(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.$r8$classId = 4;
        this.f$3 = z;
        this.f$2 = i;
        this.f$0 = str;
        this.f$1 = imageReceiver;
        this.f$4 = zArr;
    }
}
