package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.tgnet.tl.TL_iv;
public interface qy0 {
    jy0 createTextLayout(TL_iv.pageTableCell pagetablecell, int i9);

    Paint getHeaderPaint();

    Paint getLinePaint();

    Paint getStripPaint();

    void onLayoutChild(jy0 jy0Var, int i9, int i10);
}
