package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends f2.v {
    public final l1 f37197c;

    public h1(l1 l1Var) {
        this.f37197c = l1Var;
    }

    @Override
    public final int i(int i10) {
        l1 l1Var = this.f37197c;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.f38461s.items;
        return ((MessageObject.GroupedMessagePosition) l1Var.v.f38157b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
