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
public final class pi implements Utilities.CallbackReturn {
    public final int f31681a;
    public final Object f31682b;

    public pi(Object obj, int i10) {
        this.f31681a = i10;
        this.f31682b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f31681a) {
            case 0:
                return Boolean.valueOf(yi.J((yi) this.f31682b, (MessageObject) obj));
            case 1:
                ch.g gVar = (ch.g) this.f31682b;
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
                svgThumb.setColorKey(org.telegram.ui.ActionBar.g6.f23300qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(gVar.f3500b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new yp(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new ch.f(imageReceiver, 0));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new cf.f(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f31682b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z10 = true;
                if (i13 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                u51 u51Var = (u51) this.f31682b;
                View view2 = (View) obj;
                u51Var.getClass();
                if (view2.getParent() != u51Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!k51.K(u51Var.T(view2).f6436f));
        }
    }
}
