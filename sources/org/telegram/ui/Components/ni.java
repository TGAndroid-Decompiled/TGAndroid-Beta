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
public final class ni implements Utilities.CallbackReturn {
    public final int f27270a;
    public final Object f27271b;

    public ni(Object obj, int i10) {
        this.f27270a = i10;
        this.f27271b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f27270a) {
            case 0:
                return Boolean.valueOf(wi.J((wi) this.f27271b, (MessageObject) obj));
            case 1:
                eh.g gVar = (eh.g) this.f27271b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = R.raw.map_placeholder;
                int i12 = org.telegram.ui.ActionBar.j6.Pb;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    i10 = 3;
                } else {
                    i10 = 6;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(i11, i12, i10 * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.j6.f20122qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(gVar.f5603b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new bq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new eh.f(imageReceiver, 0));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new df.f(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f27271b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z4 = true;
                if (i13 != 1) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                g61 g61Var = (g61) this.f27271b;
                View view2 = (View) obj;
                g61Var.getClass();
                if (view2.getParent() != g61Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!w51.K(g61Var.T(view2).f5777f));
        }
    }
}
