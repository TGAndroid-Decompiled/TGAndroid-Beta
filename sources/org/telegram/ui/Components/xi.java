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
    public final int f30325a;
    public final Object f30326b;

    public xi(Object obj, int i10) {
        this.f30325a = i10;
        this.f30326b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10;
        switch (this.f30325a) {
            case 0:
                return Boolean.valueOf(gj.K((gj) this.f30326b, (MessageObject) obj));
            case 1:
                rh.f fVar = (rh.f) this.f30326b;
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
                svgThumb.setColorKey(org.telegram.ui.ActionBar.j6.f19355qe);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(fVar.f42918b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new eq(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new org.telegram.ui.Cells.r8(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new ed(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 2:
                int i13 = ((SparseIntArray) this.f30326b).get(((Integer) obj).intValue(), -1);
                if (i13 == -1) {
                    return Boolean.TRUE;
                }
                boolean z10 = true;
                if (i13 != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                u61 u61Var = (u61) this.f30326b;
                View view2 = (View) obj;
                u61Var.getClass();
                if (view2.getParent() != u61Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!m61.K(u61Var.U(view2).f42998f));
        }
    }
}
