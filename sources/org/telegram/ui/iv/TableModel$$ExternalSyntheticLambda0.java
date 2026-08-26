package org.telegram.ui.iv;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.text.Collator;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.Premium.FeaturesPageView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.StoriesController;

public final class TableModel$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;

    public TableModel$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        boolean zIsService;
        boolean zIsService2;
        ?? r1;
        boolean z;
        ?? r0;
        switch (this.$r8$classId) {
            case 0:
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                TableModel tableModel = (TableModel) this.f$0;
                int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
                int iAnchorRowOf2 = tableModel.anchorRowOf(pagetablecell2);
                return iAnchorRowOf != iAnchorRowOf2 ? Integer.compare(iAnchorRowOf, iAnchorRowOf2) : Integer.compare(tableModel.anchorColOf(pagetablecell), tableModel.anchorColOf(pagetablecell2));
            case 1:
                MediaCodecUtil.ScoreProvider scoreProvider = (MediaCodecUtil.ScoreProvider) this.f$0;
                return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
            case 2:
                Spanned spanned = (Spanned) this.f$0;
                return spanned.getSpanStart((CodeHighlighting.Span) obj2) - spanned.getSpanStart((CodeHighlighting.Span) obj);
            case 3:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f$0;
                return spannableStringBuilder.getSpanStart((TextSelectionHelper.ReplaceCopyTextSpannable) obj2) - spannableStringBuilder.getSpanStart((TextSelectionHelper.ReplaceCopyTextSpannable) obj);
            case 4:
                EmojiView emojiView = EmojiView.this;
                int iIndexOf = emojiView.stickerSets.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int iIndexOf2 = emojiView.stickerSets.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (iIndexOf < 0 || iIndexOf2 < 0) {
                    return 0;
                }
                return iIndexOf - iIndexOf2;
            case 5:
                int i3 = ((FeaturesPageView.Item) obj).order;
                SparseIntArray sparseIntArray = (SparseIntArray) this.f$0;
                return sparseIntArray.get(i3, Integer.MAX_VALUE) - sparseIntArray.get(((FeaturesPageView.Item) obj2).order, Integer.MAX_VALUE);
            case 6:
                return ((Collator) this.f$0).compare((String) obj, (String) obj2);
            case 7:
                long jLongValue = ((Long) obj).longValue();
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f$0;
                int i4 = longSparseIntArray.get(jLongValue);
                int i5 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i4 > i5) {
                    return 1;
                }
                return i4 < i5 ? -1 : 0;
            case 8:
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) obj;
                LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) obj2;
                LocaleController.LocaleInfo localeInfo3 = (LocaleController.LocaleInfo) this.f$0;
                if (localeInfo != localeInfo3) {
                    if (localeInfo2 != localeInfo3) {
                        int i6 = localeInfo.serverIndex;
                        int i7 = localeInfo2.serverIndex;
                        if (i6 == i7) {
                            return localeInfo.name.compareTo(localeInfo2.name);
                        }
                        if (i6 <= i7) {
                            if (i6 >= i7) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 9:
                ((ProfileActivity.SearchAdapter) this.f$0).getClass();
                if (obj instanceof ProfileActivity.SearchAdapter.SearchResult) {
                    i = ((ProfileActivity.SearchAdapter.SearchResult) obj).num;
                } else {
                    i = obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                }
                if (obj2 instanceof ProfileActivity.SearchAdapter.SearchResult) {
                    i2 = ((ProfileActivity.SearchAdapter.SearchResult) obj2).num;
                } else {
                    i2 = obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                }
                if (i < i2) {
                    return -1;
                }
                return i > i2 ? 1 : 0;
            case 10:
                StarGiftSheet.CraftTopView.Cube3D cube3D = (StarGiftSheet.CraftTopView.Cube3D) this.f$0;
                cube3D.getClass();
                int iIntValue = ((Integer) obj).intValue();
                float[] fArr = cube3D.faceDepths;
                return Float.compare(fArr[iIntValue], fArr[((Integer) obj2).intValue()]);
            case 11:
                StickersActivity stickersActivity = (StickersActivity) this.f$0;
                int iIndexOf3 = stickersActivity.sets.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int iIndexOf4 = stickersActivity.sets.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (iIndexOf3 < 0 || iIndexOf4 < 0) {
                    return 0;
                }
                return iIndexOf3 - iIndexOf4;
            case 12:
                ((LiveCommentsView) this.f$0).getClass();
                return ((LiveCommentsView.TopSender) obj2).lastSentDate - ((LiveCommentsView.TopSender) obj).lastSentDate;
            default:
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean zHasUploadingStories = storiesController.hasUploadingStories(peerDialogId);
                boolean zHasUploadingStories2 = storiesController.hasUploadingStories(peerDialogId2);
                boolean zHasUnreadStories = storiesController.hasUnreadStories(peerDialogId);
                boolean zHasUnreadStories2 = storiesController.hasUnreadStories(peerDialogId2);
                boolean zHasLiveStory = storiesController.hasLiveStory(peerDialogId);
                boolean zHasLiveStory2 = storiesController.hasLiveStory(peerDialogId2);
                ?? r5 = zHasUploadingStories;
                ?? r6 = zHasUploadingStories2;
                if (zHasLiveStory != zHasLiveStory2) {
                    return (zHasLiveStory2 ? 1 : 0) - (zHasLiveStory ? 1 : 0);
                }
                if (zHasUploadingStories == zHasUploadingStories2) {
                    if (zHasUnreadStories != zHasUnreadStories2) {
                        return (zHasUnreadStories2 ? 1 : 0) - (zHasUnreadStories ? 1 : 0);
                    }
                    zIsService = UserObject.isService(peerDialogId);
                    zIsService2 = UserObject.isService(peerDialogId2);
                    if (zIsService == zIsService2) {
                        int i8 = storiesController.currentAccount;
                        TLRPC.User user = MessagesController.getInstance(i8).getUser(Long.valueOf(peerDialogId));
                        if (user == null) {
                            r5 = zIsService;
                            r6 = zIsService2;
                            r1 = 0;
                        } else {
                            r5 = zIsService;
                            r6 = zIsService2;
                            r1 = user.premium;
                        }
                        TLRPC.User user2 = MessagesController.getInstance(i8).getUser(Long.valueOf(peerDialogId2));
                        if (user2 == null) {
                            r0 = 0;
                        } else {
                            z = user2.premium;
                        }
                        if (r1 != r0) {
                            r0 = z;
                            return r0 - r1;
                        }
                        r0 = z;
                        return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) zziq.m(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) zziq.m(1, peerStories.stories)).date);
                    }
                }
                r5 = zIsService;
                r6 = zIsService2;
                return r6 - r5;
        }
    }
}
