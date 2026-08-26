package org.telegram.ui.iv;

import android.text.TextUtils;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda68;

public final class RichTextCell$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final RichTextCell f$0;

    public RichTextCell$$ExternalSyntheticLambda7(RichTextCell richTextCell, int i) {
        this.$r8$classId = i;
        this.f$0 = richTextCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RichTextCell richTextCell = this.f$0;
                richTextCell.highlightScheduled = null;
                BlockRow blockRow = richTextCell.currentRow;
                if (blockRow != null) {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String string = richTextCell.editText.getText().toString();
                        if (!string.equals(richTextCell.highlightedSnapshot)) {
                            BlockRow blockRow2 = richTextCell.currentRow;
                            String str = ((TL_iv.pageBlockPreformatted) blockRow2.block).language;
                            int i = richTextCell.highlightGeneration + 1;
                            richTextCell.highlightGeneration = i;
                            CodeHighlighting.highlightEditable(string, str, new PhotoViewer$$ExternalSyntheticLambda68(richTextCell, i, blockRow2, string, 4));
                            break;
                        }
                    }
                }
                break;
            default:
                this.f$0.persistStyle();
                break;
        }
    }
}
