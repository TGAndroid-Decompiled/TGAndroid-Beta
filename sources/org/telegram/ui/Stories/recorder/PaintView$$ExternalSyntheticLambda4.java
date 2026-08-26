package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.UItem;

public final class PaintView$$ExternalSyntheticLambda4 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public PaintView$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Utilities.Callback callback;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((StoryRecorder.WindowView) obj3).drawBlurBitmap((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 1:
                ((CaptionContainerView) obj3).drawHint((Canvas) obj, (Runnable) obj2);
                break;
            case 2:
                String str = (String) obj;
                EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) obj3;
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                emojiBottomSheet.query = str;
                emojiBottomSheet.categoryIndex = ((Integer) obj2).intValue();
                gifPage.adapter.updateItems(str);
                break;
            case 3:
                String str2 = (String) obj;
                EmojiBottomSheet.Page page = (EmojiBottomSheet.Page) obj3;
                EmojiBottomSheet emojiBottomSheet2 = EmojiBottomSheet.this;
                emojiBottomSheet2.query = str2;
                emojiBottomSheet2.categoryIndex = ((Integer) obj2).intValue();
                page.adapter.updateItems$1(str2);
                break;
            case 4:
                GallerySheet gallerySheet = (GallerySheet) obj3;
                if (obj == null) {
                    gallerySheet.getClass();
                } else if (gallerySheet.galleryListViewOpening == null && (obj instanceof MediaController.PhotoEntry) && (callback = gallerySheet.onGalleryListener) != null) {
                    callback.run((MediaController.PhotoEntry) obj);
                }
                break;
            case 5:
                PaintView paintView = (PaintView) obj3;
                paintView.appearAnimation(paintView.createLocationSticker((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) obj3;
                if (storyLinkSheet.loading || storyLinkSheet.webpage != null) {
                    TLRPC.WebPage webPage = storyLinkSheet.webpage;
                    StoryLinkSheet$$ExternalSyntheticLambda5 storyLinkSheet$$ExternalSyntheticLambda5 = new StoryLinkSheet$$ExternalSyntheticLambda5(storyLinkSheet, 1);
                    int i = StoryLinkSheet.WebpagePreviewView.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(StoryLinkSheet.WebpagePreviewView.Factory.class);
                    uItemOfFactory.object = webPage;
                    uItemOfFactory.clickCallback = storyLinkSheet$$ExternalSyntheticLambda5;
                    arrayList.add(uItemOfFactory);
                }
                arrayList.add(UItem.asCustom(storyLinkSheet.urlEditText));
                arrayList.add(UItem.asShadow(1, null));
                arrayList.add(UItem.asCheck(2, LocaleController.getString(R.string.StoryLinkNameHeader)).setChecked(storyLinkSheet.nameOpen));
                if (storyLinkSheet.nameOpen) {
                    arrayList.add(UItem.asCustom(storyLinkSheet.nameEditText));
                }
                arrayList.add(UItem.asShadow(3, null));
                arrayList.add(UItem.asCustom(storyLinkSheet.buttonContainer));
                break;
            case 7:
                Float f = (Float) obj2;
                StoryRecorder storyRecorder = (StoryRecorder) obj3;
                long duration = storyRecorder.previewView.getDuration() < 100 ? storyRecorder.outputEntry.duration : storyRecorder.previewView.getDuration();
                float fFloatValue = ((f.floatValue() / 0.96f) * 0.04f) + f.floatValue();
                StoryEntry storyEntry = storyRecorder.outputEntry;
                float f2 = storyEntry.right;
                float f3 = storyEntry.left;
                float f4 = (f2 - f3) * fFloatValue;
                float f5 = duration;
                long j = (long) (f4 * f5);
                StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
                long j2 = (long) ((f3 * f5) + j);
                storyRecorder.coverValue = j2;
                anonymousClass7.seekTo(j2);
                StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                if (anonymousClass24 != null) {
                    anonymousClass24.setCoverTime(storyRecorder.coverValue);
                }
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                if (storyEntry2 != null && storyEntry2.isEdit) {
                    storyEntry2.editedMedia = true;
                    break;
                }
                break;
            default:
                ((TimelineView.AudioWaveformLoader) obj3).receiveData((short[]) obj, ((Integer) obj2).intValue());
                break;
        }
    }
}
