package org.telegram.ui.iv;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public class BlockRow {
    private static long ID_GEN = 1;
    public TL_iv.PageBlock block;
    public boolean checkbox;
    public boolean checked;
    public boolean detailsEnd;
    public final long id;
    public int level;
    public MediaUploadState media;
    public ArrayList medias;
    public int num;

    public BlockRow(TL_iv.PageBlock pageBlock) {
        this(pageBlock, 0, 0);
    }

    public BlockRow(TL_iv.PageBlock pageBlock, int i, int i2) {
        long j = ID_GEN;
        ID_GEN = 1 + j;
        this(pageBlock, i, i2, j);
    }

    public BlockRow(TL_iv.PageBlock pageBlock, int i, int i2, long j) {
        this.block = pageBlock;
        this.level = i;
        this.num = i2;
        this.id = j;
    }

    public boolean isInList() {
        return this.level > 0;
    }

    public boolean isOrdered() {
        return this.num > 0;
    }

    public boolean isChecklist() {
        return this.level > 0 && this.checkbox;
    }
}
