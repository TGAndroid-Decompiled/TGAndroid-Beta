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
public final class oi implements Utilities.CallbackReturn {
    public final int f29772a;
    public final Object f29773b;

    public oi(Object obj, int i10) {
        this.f29772a = i10;
        this.f29773b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f29772a) {
            case 0:
                return Boolean.valueOf(xi.J((xi) this.f29773b, (MessageObject) obj));
            case 1:
                fh.g gVar = (fh.g) this.f29773b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = R.raw.map_placeholder;
                int i12 = org.telegram.ui.ActionBar.k6.Pb;
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    i10 = 3;
                } else {
                    i10 = 6;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(i11, i12, i10 * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.k6.f21903qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(gVar.f6668b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new eq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new fh.f(imageReceiver, 0));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new ef.f(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f29773b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z4 = true;
                if (i13 != 1) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                h61 h61Var = (h61) this.f29773b;
                View view2 = (View) obj;
                h61Var.getClass();
                if (view2.getParent() != h61Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!w51.K(h61Var.T(view2).f5879f));
        }
    }
}
