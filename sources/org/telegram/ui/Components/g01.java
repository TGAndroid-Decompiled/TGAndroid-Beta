package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;
public interface g01 {
    zz0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i10);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(zz0 zz0Var, int i10, int i11);
}
