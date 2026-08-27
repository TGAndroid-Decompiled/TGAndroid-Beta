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

public final class ii implements Utilities.CallbackReturn {

    public final int f29368a;

    public final Object f29369b;

    public ii(Object obj, int i10) {
        this.f29368a = i10;
        this.f29369b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f29368a) {
            case 0:
                return Boolean.valueOf(ri.K((ri) this.f29369b, (MessageObject) obj));
            case 1:
                ah.g gVar = (ah.g) this.f29369b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, org.telegram.ui.ActionBar.g6.Pb, (org.telegram.ui.ActionBar.g6.I.q() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.g6.f23290qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(gVar.f767b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new sp(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new ah.f(imageReceiver, 0));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new af.g(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i10 = ((SparseIntArray) this.f29369b).get(((Integer) obj).intValue(), -1);
                if (i10 == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i10 == 1);
            default:
                k51 k51Var = (k51) this.f29369b;
                View view2 = (View) obj;
                k51Var.getClass();
                return view2.getParent() != k51Var ? Boolean.FALSE : Boolean.valueOf(!b51.K(k51Var.T(view2).f5793f));
        }
    }
}
