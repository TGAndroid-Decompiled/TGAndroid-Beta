package org.telegram.ui.iv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public abstract class RichMessageButtonUsers {
    public static ArrayList collect(int i, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collectBlock((TL_iv.PageBlock) it.next(), linkedHashSet);
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet.size());
        MessagesController messagesController = MessagesController.getInstance(i);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            Long l = (Long) it2.next();
            l.longValue();
            TLRPC.User user = messagesController.getUser(l);
            if (user != null) {
                TLRPC.InputUser inputUser = messagesController.getInputUser(user);
                if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                    arrayList2.add(inputUser);
                }
            }
        }
        return arrayList2;
    }

    private static void collectBlock(TL_iv.PageBlock pageBlock, LinkedHashSet linkedHashSet) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        if (pageBlock == null) {
            return;
        }
        collectText(pageBlock.text, linkedHashSet);
        collectCaption(pageBlock.caption, linkedHashSet);
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            ArrayList<TL_keyboard.PageButton> arrayList2 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
            if (arrayList2 != null) {
                Iterator<TL_keyboard.PageButton> it = arrayList2.iterator();
                while (it.hasNext()) {
                    TL_keyboard.PageButton next = it.next();
                    if (next != null) {
                        collectType(next.type, linkedHashSet);
                        collectText(next.text, linkedHashSet);
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            collectText(((TL_iv.pageBlockBlockquote) pageBlock).caption, linkedHashSet);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            collectText(((TL_iv.pageBlockPullquote) pageBlock).caption, linkedHashSet);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            collectText(pageblockblockquoteblocks.caption, linkedHashSet);
            collectBlocks(pageblockblockquoteblocks.blocks, linkedHashSet);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            collectText(pageblockdetails.title, linkedHashSet);
            collectBlocks(pageblockdetails.blocks, linkedHashSet);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
            if (arrayList3 != null) {
                Iterator<TL_iv.PageListItem> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    TL_iv.PageListItem next2 = it2.next();
                    if (next2 instanceof TL_iv.TL_pageListItemText) {
                        collectText(((TL_iv.TL_pageListItemText) next2).text, linkedHashSet);
                    } else if (next2 instanceof TL_iv.TL_pageListItemBlocks) {
                        collectBlocks(((TL_iv.TL_pageListItemBlocks) next2).blocks, linkedHashSet);
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList4 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            if (arrayList4 != null) {
                Iterator<TL_iv.PageListOrderedItem> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    TL_iv.PageListOrderedItem next3 = it3.next();
                    if (next3 instanceof TL_iv.TL_pageListOrderedItemText) {
                        collectText(((TL_iv.TL_pageListOrderedItemText) next3).text, linkedHashSet);
                    } else if (next3 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        collectBlocks(((TL_iv.TL_pageListOrderedItemBlocks) next3).blocks, linkedHashSet);
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            collectText(pageblocktable.title, linkedHashSet);
            ArrayList<TL_iv.pageTableRow> arrayList5 = pageblocktable.rows;
            if (arrayList5 != null) {
                Iterator<TL_iv.pageTableRow> it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    TL_iv.pageTableRow next4 = it4.next();
                    if (next4 != null && (arrayList = next4.cells) != null) {
                        Iterator<TL_iv.pageTableCell> it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            TL_iv.pageTableCell next5 = it5.next();
                            if (next5 != null) {
                                collectText(next5.text, linkedHashSet);
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            collectBlocks(((TL_iv.pageBlockCollage) pageBlock).items, linkedHashSet);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            collectBlocks(((TL_iv.pageBlockSlideshow) pageBlock).items, linkedHashSet);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            collectBlocks(((TL_iv.pageBlockEmbedPost) pageBlock).blocks, linkedHashSet);
        } else if (pageBlock instanceof TL_iv.pageBlockCover) {
            collectBlock(((TL_iv.pageBlockCover) pageBlock).cover, linkedHashSet);
        } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
            collectText(((TL_iv.pageBlockRelatedArticles) pageBlock).title, linkedHashSet);
        }
    }

    private static void collectBlocks(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            collectBlock((TL_iv.PageBlock) it.next(), linkedHashSet);
        }
    }

    private static void collectCaption(TL_iv.PageCaption pageCaption, LinkedHashSet linkedHashSet) {
        if (pageCaption == null) {
            return;
        }
        collectText(pageCaption.text, linkedHashSet);
        collectText(pageCaption.credit, linkedHashSet);
    }

    private static void collectText(TL_iv.RichText richText, LinkedHashSet linkedHashSet) {
        if (richText == null) {
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            collectType(((TL_iv.textButton) richText).type, linkedHashSet);
        } else if (richText instanceof TL_iv.textDiff) {
            collectText(((TL_iv.textDiff) richText).old_text, linkedHashSet);
        }
        collectText(richText.text, linkedHashSet);
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        if (arrayList != null) {
            Iterator<TL_iv.RichText> it = arrayList.iterator();
            while (it.hasNext()) {
                collectText(it.next(), linkedHashSet);
            }
        }
    }

    private static void collectType(TL_keyboard.InlineButtonType inlineButtonType, LinkedHashSet linkedHashSet) {
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
            long j = ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id;
            if (j != 0) {
                linkedHashSet.add(Long.valueOf(j));
            }
        }
    }
}
