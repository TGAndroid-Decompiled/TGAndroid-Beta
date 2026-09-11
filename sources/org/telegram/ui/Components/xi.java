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
    public final int f32548a;
    public final Object f32549b;

    public xi(Object obj, int i10) {
        this.f32548a = i10;
        this.f32549b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f32548a) {
            case 0:
                return Boolean.valueOf(gj.K((gj) this.f32549b, (MessageObject) obj));
            case 1:
                sh.f fVar = (sh.f) this.f32549b;
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
                svgThumb.setColorKey(org.telegram.ui.ActionBar.j6.f20905qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.f46406b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new dq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.q8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new fd(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f32549b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z10 = true;
                if (i13 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                d61 d61Var = (d61) this.f32549b;
                View view2 = (View) obj;
                d61Var.getClass();
                if (view2.getParent() != d61Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!v51.K(d61Var.T(view2).f45742f));
        }
    }
}
