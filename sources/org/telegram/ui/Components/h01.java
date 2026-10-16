package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;
public interface h01 {
    a01 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(a01 a01Var, int i10, int i11);
}
