package org.telegram.ui.iv;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class RichEditor$$ExternalSyntheticLambda31 implements Runnable {
    public final int $r8$classId;
    public final RichEditor f$0;
    public final BlockRow f$1;

    public RichEditor$$ExternalSyntheticLambda31(RichEditor richEditor, BlockRow blockRow, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditor;
        this.f$1 = blockRow;
    }

    @Override
    public final void run() {
        BlockRow blockRow = this.f$1;
        RichEditor richEditor = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                RichEditorListView richEditorListView = richEditor.listView;
                ArrayList arrayList = RichEditorListView.EMPTY_QUOTE_IDS;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                richEditorListView.turnInto(this.f$1, pageblockpullquote, 0, 0, false, false);
                break;
            case 1:
                richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockPreformatted());
                break;
            case 2:
                richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockFooter());
                break;
            case 3:
                richEditor.listView.turnIntoKeepList(blockRow, new TL_iv.pageBlockParagraph());
                break;
            case 4:
                RichEditorListView richEditorListView2 = richEditor.listView;
                ArrayList arrayList2 = RichEditorListView.EMPTY_QUOTE_IDS;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                richEditorListView2.turnInto(this.f$1, pageblockblockquote, 0, 0, false, false);
                break;
            case 5:
                richEditor.listView.turnIntoList(blockRow, 0);
                break;
            case 6:
                richEditor.listView.turnIntoList(blockRow, 1);
                break;
            case 7:
                richEditor.listView.turnIntoList(blockRow, 2);
                break;
            case 8:
                richEditor.listView.turnIntoList(blockRow, 3);
                break;
            default:
                View viewFindViewByItemObject = richEditor.listView.findViewByItemObject(blockRow);
                if (!(viewFindViewByItemObject instanceof RichMapCell)) {
                    richEditor.listView.adapter.update(false);
                } else {
                    RichMapCell richMapCell = (RichMapCell) viewFindViewByItemObject;
                    RichMapCell.Delegate mapDelegate = richEditor.listView.getMapDelegate();
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
        }
    }
}
