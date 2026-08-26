package org.telegram.ui.iv;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;

public final class TableModel$$ExternalSyntheticLambda2 implements ToIntFunction {
    public final int $r8$classId;
    public final Object f$0;

    public TableModel$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((int[]) ((IdentityHashMap) this.f$0).get((TL_iv.pageTableCell) obj))[1];
            case 1:
                return ((Integer) ((HashMap) this.f$0).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f$0).get(((Integer) obj).intValue())).intValue();
        }
    }
}
