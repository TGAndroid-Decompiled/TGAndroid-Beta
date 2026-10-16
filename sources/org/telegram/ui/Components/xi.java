package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
public final class xi implements Utilities.CallbackReturn {
    public final int f30938a;
    public final Object f30939b;

    public xi(Object obj, int i10) {
        this.f30938a = i10;
        this.f30939b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f30938a) {
            case 0:
                return Boolean.valueOf(hj.N((hj) this.f30939b, (MessageObject) obj));
            case 1:
                sh.f fVar = (sh.f) this.f30939b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = R.raw.map_placeholder;
                int i12 = org.telegram.ui.ActionBar.g6.Pb;
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    i10 = 3;
                } else {
                    i10 = 6;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(i11, i12, i10 * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.g6.f19846qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.f45470b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new rq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.q8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new gd(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f30939b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z10 = true;
                if (i13 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                i71 i71Var = (i71) this.f30939b;
                View view2 = (View) obj;
                i71Var.getClass();
                if (view2.getParent() != i71Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!a71.K(i71Var.T(view2).f44841f));
        }
    }
}
