package org.telegram.ui.iv;

import org.telegram.tgnet.tl.TL_iv;

public class BlockRow {
    public TL_iv.PageBlock block;
    public int level;
    public MediaUploadState media;
    public int num;

    public BlockRow(TL_iv.PageBlock pageBlock) {
        this(pageBlock, 0, 0);
    }

    public BlockRow(TL_iv.PageBlock pageBlock, int i, int i2) {
        this.block = pageBlock;
        this.level = i;
        this.num = i2;
    }

    public boolean isInList() {
        return this.level > 0;
    }
}
