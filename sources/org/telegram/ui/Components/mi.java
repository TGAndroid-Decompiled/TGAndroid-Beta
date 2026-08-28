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
public final class mi implements Utilities.CallbackReturn {
    public final int f30838a;
    public final Object f30839b;

    public mi(Object obj, int i9) {
        this.f30838a = i9;
        this.f30839b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i9;
        switch (this.f30838a) {
            case 0:
                return Boolean.valueOf(vi.J((vi) this.f30839b, (MessageObject) obj));
            case 1:
                zg.f fVar = (zg.f) this.f30839b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i10 = R.raw.map_placeholder;
                int i11 = org.telegram.ui.ActionBar.f6.Pb;
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    i9 = 3;
                } else {
                    i9 = 6;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(i10, i11, i9 * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.f6.f23237qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.f50839b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new up(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.o8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new vc(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i12 = ((SparseIntArray) this.f30839b).get(((Integer) obj).intValue(), -1);
                if (i12 == -1) {
                    return Boolean.TRUE;
                }
                boolean z10 = true;
                if (i12 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                i51 i51Var = (i51) this.f30839b;
                View view2 = (View) obj;
                i51Var.getClass();
                if (view2.getParent() != i51Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!z41.K(i51Var.T(view2).f5505f));
        }
    }
}
