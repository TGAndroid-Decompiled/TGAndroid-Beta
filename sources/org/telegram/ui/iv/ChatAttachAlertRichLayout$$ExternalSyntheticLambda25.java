package org.telegram.ui.iv;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class ChatAttachAlertRichLayout$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertRichLayout f$0;
    public final BlockRow f$1;

    public ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(ChatAttachAlertRichLayout chatAttachAlertRichLayout, BlockRow blockRow, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertRichLayout;
        this.f$1 = blockRow;
    }

    @Override
    public final void run() {
        BlockRow blockRow = this.f$1;
        ChatAttachAlertRichLayout chatAttachAlertRichLayout = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
                if (!(viewFindViewByItemObject instanceof RichMapCell)) {
                    richEditorListView.adapter.update(false);
                } else {
                    RichMapCell richMapCell = (RichMapCell) viewFindViewByItemObject;
                    RichMapCell.Delegate mapDelegate = richEditorListView.getMapDelegate();
                    richMapCell.currentRow = blockRow;
                    richMapCell.delegate = mapDelegate;
                    richMapCell.bindBlockInset(blockRow);
                    richMapCell.loadedKey = null;
                    richMapCell.caption.bind();
                    richMapCell.loadMapImage();
                    richMapCell.requestLayout();
                    richMapCell.invalidate();
                }
                break;
            case 1:
                chatAttachAlertRichLayout.listView.turnIntoList(blockRow, 0);
                break;
            case 2:
                chatAttachAlertRichLayout.listView.turnIntoList(blockRow, 1);
                break;
            case 3:
                chatAttachAlertRichLayout.listView.turnIntoList(blockRow, 2);
                break;
            case 4:
                chatAttachAlertRichLayout.listView.turnIntoList(blockRow, 3);
                break;
            case 5:
                chatAttachAlertRichLayout.getClass();
                chatAttachAlertRichLayout.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockParagraph());
                break;
            case 6:
                chatAttachAlertRichLayout.getClass();
                ArrayList arrayList = RichEditorListView.EMPTY_QUOTE_IDS;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                chatAttachAlertRichLayout.listView.turnInto(this.f$1, pageblockblockquote, 0, 0, false, false);
                break;
            case 7:
                chatAttachAlertRichLayout.getClass();
                ArrayList arrayList2 = RichEditorListView.EMPTY_QUOTE_IDS;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                chatAttachAlertRichLayout.listView.turnInto(this.f$1, pageblockpullquote, 0, 0, false, false);
                break;
            case 8:
                chatAttachAlertRichLayout.getClass();
                chatAttachAlertRichLayout.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockPreformatted());
                break;
            default:
                chatAttachAlertRichLayout.getClass();
                chatAttachAlertRichLayout.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockFooter());
                break;
        }
    }
}
