package org.telegram.ui.iv;

public final class RichContainer {
    private static long ID_GEN = 1;
    public boolean checklist;
    public long id;
    public boolean itemChecked;
    public long itemId;
    public int itemNum;
    public boolean open;
    public boolean ordered;
    public final int type;

    public static long newId() {
        long j = ID_GEN;
        ID_GEN = 1 + j;
        return j;
    }

    public RichContainer(int i, long j) {
        this.type = i;
        this.id = j;
    }

    public static RichContainer list(long j, long j2, boolean z, boolean z2, boolean z3) {
        RichContainer richContainer = new RichContainer(0, j);
        richContainer.itemId = j2;
        richContainer.ordered = z;
        richContainer.checklist = z2;
        richContainer.itemChecked = z3;
        return richContainer;
    }

    public static RichContainer quote(long j) {
        return new RichContainer(1, j);
    }

    public static RichContainer details(long j, boolean z) {
        RichContainer richContainer = new RichContainer(2, j);
        richContainer.open = z;
        return richContainer;
    }
}
