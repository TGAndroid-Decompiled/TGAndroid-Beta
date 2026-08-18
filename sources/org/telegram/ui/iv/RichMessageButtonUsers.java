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
        LinkedHashSet<Long> linkedHashSet = new LinkedHashSet();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collectBlock((TL_iv.PageBlock) it.next(), linkedHashSet);
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet.size());
        MessagesController messagesController = MessagesController.getInstance(i);
        for (Long l : linkedHashSet) {
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
                for (TL_keyboard.PageButton pageButton : arrayList2) {
                    if (pageButton != null) {
                        collectType(pageButton.type, linkedHashSet);
                        collectText(pageButton.text, linkedHashSet);
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
                for (TL_iv.PageListItem pageListItem : arrayList3) {
                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                        collectText(((TL_iv.TL_pageListItemText) pageListItem).text, linkedHashSet);
                    } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        collectBlocks(((TL_iv.TL_pageListItemBlocks) pageListItem).blocks, linkedHashSet);
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList4 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            if (arrayList4 != null) {
                for (TL_iv.PageListOrderedItem pageListOrderedItem : arrayList4) {
                    if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                        collectText(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, linkedHashSet);
                    } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        collectBlocks(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks, linkedHashSet);
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
                for (TL_iv.pageTableRow pagetablerow : arrayList5) {
                    if (pagetablerow != null && (arrayList = pagetablerow.cells) != null) {
                        for (TL_iv.pageTableCell pagetablecell : arrayList) {
                            if (pagetablecell != null) {
                                collectText(pagetablecell.text, linkedHashSet);
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
