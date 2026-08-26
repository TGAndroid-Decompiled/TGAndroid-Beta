package org.telegram.ui;

import android.util.Pair;
import io.noties.markwon.html.HtmlTagImpl;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;

public final class ChatActivity$$ExternalSyntheticLambda18 implements Comparator {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda18(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        switch (this.$r8$classId) {
            case 0:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 1:
                return ((QuickRepliesController.QuickReply) obj).order - ((QuickRepliesController.QuickReply) obj2).order;
            case 2:
                long j2 = ((CacheControlActivity.DialogFileEntities) obj2).totalSize;
                long j3 = ((CacheControlActivity.DialogFileEntities) obj).totalSize;
                if (j2 > j3) {
                    return 1;
                }
                return j2 < j3 ? -1 : 0;
            case 3:
                return Long.compare(((CacheControlActivity.ItemInner) obj2).size, ((CacheControlActivity.ItemInner) obj).size);
            case 4:
                ChatMessageCell.PollButton pollButton = (ChatMessageCell.PollButton) obj;
                ChatMessageCell.PollButton pollButton2 = (ChatMessageCell.PollButton) obj2;
                float f = pollButton.decimal;
                float f2 = pollButton2.decimal;
                if (f <= f2) {
                    if (f < f2 || (i = pollButton.percent) > (i2 = pollButton2.percent)) {
                        return 1;
                    }
                    if (i >= i2) {
                        return 0;
                    }
                }
                return -1;
            case 5:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 6:
                return ((MessageObject) obj2).getId() - ((MessageObject) obj).getId();
            case 7:
                return ((MessageObject) obj2).getId() - ((MessageObject) obj).getId();
            case 8:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int channelAdminParticipantType = ChatUsersActivity.getChannelAdminParticipantType(tLObject);
                int channelAdminParticipantType2 = ChatUsersActivity.getChannelAdminParticipantType(tLObject2);
                if (channelAdminParticipantType > channelAdminParticipantType2) {
                    return 1;
                }
                if (channelAdminParticipantType < channelAdminParticipantType2) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 9:
                int channelAdminParticipantType3 = ChatUsersActivity.getChannelAdminParticipantType((TLObject) obj);
                int channelAdminParticipantType4 = ChatUsersActivity.getChannelAdminParticipantType((TLObject) obj2);
                if (channelAdminParticipantType3 > channelAdminParticipantType4) {
                    return 1;
                }
                return channelAdminParticipantType3 < channelAdminParticipantType4 ? -1 : 0;
            case 10:
                return ((BackButtonMenu.PulledDialog) obj2).stackIndex - ((BackButtonMenu.PulledDialog) obj).stackIndex;
            case 11:
                return ((BackButtonMenu.PulledDialog) obj2).stackIndex - ((BackButtonMenu.PulledDialog) obj).stackIndex;
            case 12:
                return Long.compare(((CacheChart.SegmentSize) obj).size, ((CacheChart.SegmentSize) obj2).size);
            case 13:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float fAbs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float fAbs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (fAbs < fAbs2) {
                    return -1;
                }
                return fAbs > fAbs2 ? 1 : 0;
            case 14:
                HtmlTagImpl.BlockImpl blockImpl = (HtmlTagImpl.BlockImpl) obj;
                HtmlTagImpl.BlockImpl blockImpl2 = (HtmlTagImpl.BlockImpl) obj2;
                int iCompare = Integer.compare(blockImpl.start, blockImpl2.start);
                return iCompare != 0 ? iCompare : Integer.compare(blockImpl2.end, blockImpl.end);
            case 15:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
            case 16:
                float f3 = ((PollVotesAlert.Button) obj).decimal;
                float f4 = ((PollVotesAlert.Button) obj2).decimal;
                if (f3 > f4) {
                    return -1;
                }
                return f3 < f4 ? 1 : 0;
            case 17:
                return (int) ((((PremiumStickersPreviewRecycler.StickerView) obj).progress * 100.0f) - (((PremiumStickersPreviewRecycler.StickerView) obj2).progress * 100.0f));
            case 18:
                return ((String) obj).compareTo((String) obj2);
            case 19:
                TLObject tLObject3 = (TLObject) obj;
                TLObject tLObject4 = (TLObject) obj2;
                long j4 = 0;
                if (tLObject3 instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject3).id;
                } else {
                    j = tLObject3 instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject3).id : 0L;
                }
                if (tLObject4 instanceof TLRPC.User) {
                    j4 = ((TLRPC.User) tLObject4).id;
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    j4 = ((TLRPC.Chat) tLObject4).id;
                }
                return (int) (j - j4);
            case 20:
                return Float.compare(((RecyclerListView.SectionsDrawer.Section) obj).from, ((RecyclerListView.SectionsDrawer.Section) obj2).from);
            case 21:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 22:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 23:
                int i3 = ((ShareAlert.DialogSearchResult) obj).date;
                int i4 = ((ShareAlert.DialogSearchResult) obj2).date;
                if (i3 < i4) {
                    return 1;
                }
                return i3 > i4 ? -1 : 0;
            case 24:
                return ((SharedMediaLayout.Period) obj2).date - ((SharedMediaLayout.Period) obj).date;
            case 25:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 26:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int iTypeToIndex = DownloadController.typeToIndex(4);
                int iTypeToIndex2 = DownloadController.typeToIndex(8);
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i5 < iArr.length) {
                        int i6 = iArr[i5];
                        if ((i6 & 4) != 0) {
                            z = true;
                        }
                        if ((i6 & 8) != 0) {
                            z2 = true;
                        }
                        if (!z || !z2) {
                            i5++;
                        }
                    }
                }
                int i7 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i7 < iArr2.length) {
                        int i8 = iArr2[i7];
                        if ((i8 & 4) != 0) {
                            z3 = true;
                        }
                        if ((i8 & 8) != 0) {
                            z4 = true;
                        }
                        if (!z3 || !z4) {
                            i7++;
                        }
                    }
                }
                long j5 = (z ? preset.sizes[iTypeToIndex] : 0L) + (z2 ? preset.sizes[iTypeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j6 = (z3 ? preset2.sizes[iTypeToIndex] : 0L) + (z4 ? preset2.sizes[iTypeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            case 27:
                return Long.compare(((DataUsage2Activity.ListView.Size) obj2).size, ((DataUsage2Activity.ListView.Size) obj).size);
            case 28:
                long j7 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j8 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j7 > j8) {
                    return 1;
                }
                return j7 < j8 ? -1 : 0;
            default:
                int i9 = ((ContactsController.Contact) obj).imported;
                int i10 = ((ContactsController.Contact) obj2).imported;
                if (i9 > i10) {
                    return -1;
                }
                return i9 < i10 ? 1 : 0;
        }
    }
}
