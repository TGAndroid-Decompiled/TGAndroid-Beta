package org.telegram.ui.Stories.recorder;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Business.BusinessIntroActivity$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.RecyclerListView;

public final class PaintView$$ExternalSyntheticLambda18 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;

    public PaintView$$ExternalSyntheticLambda18(FrameLayout frameLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
    }

    @Override
    public final void onItemClick(View view, int i) {
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this.f$0;
                PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
                anonymousClass24.textOptionsView.setTypeface(paintTypeface.key);
                PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(anonymousClass24.currentAccount);
                String str = paintTypeface.key;
                persistColorPalette.currentTypeface = str;
                persistColorPalette.mConfig.edit().putString("typeface", str).apply();
                EntityView entityView = anonymousClass24.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    ((TextPaintView) entityView).setTypeface(paintTypeface);
                }
                anonymousClass24.showTypefaceMenu$1(false);
                break;
            case 1:
                Utilities.Callback callback = ((CollageLayoutButton.CollageLayoutListView) this.f$0).onLayoutClick;
                if (callback != null) {
                    callback.run((CollageLayout) CollageLayout.getLayouts().get(i));
                }
                break;
            case 2:
                EmojiBottomSheet.GifPage gifPage = (EmojiBottomSheet.GifPage) this.f$0;
                Object item = gifPage.adapter.getItem(i);
                if (item instanceof TLRPC.BotInlineResult) {
                    botInlineResult = (TLRPC.BotInlineResult) item;
                    document = botInlineResult.document;
                } else if (item instanceof TLRPC.Document) {
                    document = (TLRPC.Document) item;
                    botInlineResult = null;
                }
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                Utilities.Callback3Return callback3Return = emojiBottomSheet.onDocumentSelected;
                if (callback3Return != null) {
                    callback3Return.run(botInlineResult, document, Boolean.TRUE);
                }
                emojiBottomSheet.lambda$showGiftOfferSheet$15();
                break;
            default:
                EmojiBottomSheet.Page page = (EmojiBottomSheet.Page) this.f$0;
                if (i < 0) {
                    page.getClass();
                    break;
                } else if (page.layoutManager.getItemViewType(view) != 4) {
                    EmojiBottomSheet.Page.Adapter adapter = page.adapter;
                    TLRPC.Document documentFindDocument = i >= adapter.documents.size() ? null : (TLRPC.Document) adapter.documents.get(i);
                    EmojiBottomSheet emojiBottomSheet2 = EmojiBottomSheet.this;
                    if (documentFindDocument == emojiBottomSheet2.plus) {
                        BusinessIntroActivity$$ExternalSyntheticLambda2 businessIntroActivity$$ExternalSyntheticLambda2 = emojiBottomSheet2.onPlusSelected;
                        if (businessIntroActivity$$ExternalSyntheticLambda2 != null) {
                            businessIntroActivity$$ExternalSyntheticLambda2.run();
                        }
                        emojiBottomSheet2.lambda$showGiftOfferSheet$15();
                        break;
                    } else {
                        ArrayList arrayList = adapter.documentIds;
                        long jLongValue = i >= arrayList.size() ? 0L : ((Long) arrayList.get(i)).longValue();
                        if (documentFindDocument == null && (view instanceof EmojiBottomSheet.EmojiListView.EmojiImageView) && (animatedEmojiDrawable = ((EmojiBottomSheet.EmojiListView.EmojiImageView) view).drawable) != null) {
                            documentFindDocument = animatedEmojiDrawable.getDocument();
                        }
                        if (documentFindDocument == null && jLongValue != 0) {
                            documentFindDocument = AnimatedEmojiDrawable.findDocument(((BottomSheet) emojiBottomSheet2).currentAccount, jLongValue);
                        }
                        if (documentFindDocument != null) {
                            Utilities.Callback3Return callback3Return2 = emojiBottomSheet2.onDocumentSelected;
                            if (callback3Return2 != null) {
                                callback3Return2.run(adapter.setByDocumentId.get(Long.valueOf(documentFindDocument.id)), documentFindDocument, Boolean.FALSE);
                            }
                            emojiBottomSheet2.lambda$showGiftOfferSheet$15();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
