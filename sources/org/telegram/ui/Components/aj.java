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
public final class aj implements Utilities.CallbackReturn {
    public final int f24573a;
    public final Object f24574b;

    public aj(Object obj, int i10) {
        this.f24573a = i10;
        this.f24574b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f24573a) {
            case 0:
                return Boolean.valueOf(kj.N((kj) this.f24574b, (MessageObject) obj));
            case 1:
                rh.f fVar = (rh.f) this.f24574b;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                int i11 = R.raw.map_placeholder;
                int i12 = org.telegram.ui.ActionBar.i6.Pb;
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    i10 = 3;
                } else {
                    i10 = 6;
                }
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(i11, i12, i10 * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(org.telegram.ui.ActionBar.i6.f21048qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.f47604b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new uq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.q8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new hd(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f24574b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z10 = true;
                if (i13 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                l71 l71Var = (l71) this.f24574b;
                View view2 = (View) obj;
                l71Var.getClass();
                if (view2.getParent() != l71Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!d71.K(l71Var.T(view2).f47706f));
        }
    }
}
