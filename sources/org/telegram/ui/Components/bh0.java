package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class bh0 extends jp {

    public final ArrayList f27100c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final Context f27101e;

    public final Paint f27102f;

    public n9 f27103g;
    public final ch0 h;

    public bh0(ch0 ch0Var, Context context, org.telegram.ui.iz0 iz0Var) {
        this.h = ch0Var;
        this.f27101e = context;
        this.f27103g = iz0Var;
        Paint paint = new Paint(1);
        this.f27102f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        yg0 yg0Var = (yg0) obj;
        View view = yg0Var.f34897b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (yg0Var.f34896a) {
            return;
        }
        wg0 wg0Var = yg0Var.f34898c;
        if (wg0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = wg0Var.getImageReceiver().getDrawable();
            if (drawable instanceof x5) {
                ((x5) drawable).w(wg0Var);
            }
        }
        wg0Var.setRoundRadius(0);
        gVar.removeView(wg0Var);
        wg0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f27100c.size();
    }

    @Override
    public final int c(Object obj) {
        int iIndexOf = this.f27100c.indexOf((yg0) obj);
        if (iIndexOf == -1) {
            return -2;
        }
        return iIndexOf;
    }

    @Override
    public final CharSequence d(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
        sb2.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.O0;
        sb2.append(dialogPhotos == null ? 0 : dialogPhotos.getCount());
        return sb2.toString();
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        ImageLocation imageLocation;
        n9 n9Var;
        Bitmap bitmap;
        String string;
        String str2;
        yg0 yg0Var = (yg0) this.f27100c.get(i10);
        int iK = k(i10);
        ch0 ch0Var = this.h;
        boolean z12 = ch0Var.f27436e1;
        SparseArray sparseArray2 = ch0Var.Z0;
        ArrayList arrayList = ch0Var.X0;
        ArrayList arrayList2 = ch0Var.W0;
        ArrayList arrayList3 = ch0Var.T0;
        ArrayList arrayList4 = ch0Var.U0;
        ArrayList arrayList5 = ch0Var.V0;
        ArrayList arrayList6 = ch0Var.S0;
        Context context = this.f27101e;
        if (z12 && iK == 0) {
            yg0Var.f34896a = true;
            if (yg0Var.f34897b == null) {
                yg0Var.f34897b = new zg0(context);
            }
            if (yg0Var.f34897b.getParent() == null) {
                gVar.addView(yg0Var.f34897b);
            }
            return yg0Var;
        }
        yg0Var.f34896a = false;
        zg0 zg0Var = yg0Var.f34897b;
        if (zg0Var != null && zg0Var.getParent() != null) {
            gVar.removeView(yg0Var.f34897b);
        }
        if (yg0Var.f34898c == null) {
            wg0 wg0Var = new wg0(ch0Var, context, i10, this.f27102f);
            yg0Var.f34898c = wg0Var;
            this.d.set(i10, wg0Var);
        }
        if (yg0Var.f34898c.getParent() == null) {
            gVar.addView(yg0Var.f34898c);
        }
        yg0Var.f34898c.getImageReceiver().setAllowDecodeSingleFrame(true);
        int i12 = ch0Var.f27436e1 ? iK - 1 : iK;
        if (i12 == 0) {
            n9 n9Var2 = this.f27103g;
            Drawable drawable = n9Var2 == null ? null : n9Var2.getImageReceiver().getDrawable();
            if (drawable instanceof x5) {
                x5 x5Var = (x5) drawable;
                if (x5Var.s()) {
                    yg0Var.f34898c.setImageDrawable(drawable);
                    x5Var.f(yg0Var.f34898c);
                    x5Var.N = true;
                } else if (i12 < 0 && i12 < arrayList6.size()) {
                    ImageLocation imageLocation2 = (ImageLocation) arrayList6.get(i12);
                    yg0Var.f34898c.H = imageLocation2 != null;
                    boolean z13 = arrayList5.get(i12) == null;
                    if (!ch0Var.F0 || imageLocation2 == null) {
                        z11 = z13;
                    } else {
                        z11 = z13;
                        str = imageLocation2.imageType == 2 ? "avatar" : null;
                        imageLocation = (ImageLocation) arrayList4.get(i12);
                        n9Var = this.f27103g;
                        i11 = iK;
                        if (n9Var == null && ch0Var.f27432a1) {
                            bitmap = n9Var.getImageReceiver().getBitmap();
                        } else {
                            bitmap = null;
                        }
                        StringBuilder sb2 = new StringBuilder("avatar_");
                        sparseArray = sparseArray2;
                        sb2.append(ch0Var.A0);
                        string = sb2.toString();
                        if (bitmap == null && arrayList5.get(i12) == null) {
                            wg0 wg0Var2 = yg0Var.f34898c;
                            ImageLocation imageLocation3 = (ImageLocation) arrayList6.get(i12);
                            ImageLocation imageLocation4 = (ImageLocation) arrayList3.get(i12);
                            int iIntValue = ((Integer) arrayList2.get(i12)).intValue();
                            wg0Var2.getClass();
                            wg0Var2.f30898a.setImage(imageLocation3, str, imageLocation4, null, null, null, new BitmapDrawable((Resources) null, bitmap), iIntValue, null, string, 1);
                            wg0Var2.d();
                        } else if (ch0Var.G0 != null) {
                            yg0Var.f34898c.o((w51) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ch0Var.G0, null, ((Integer) arrayList2.get(i12)).intValue(), string);
                        } else {
                            if (imageLocation == null && (imageLocation.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                                str2 = "b";
                            } else {
                                str2 = null;
                            }
                            yg0Var.f34898c.o((w51) arrayList5.get(i12), imageLocation2, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), str2, ((Integer) arrayList2.get(i12)).intValue(), string);
                        }
                        z10 = z11;
                    }
                    imageLocation = (ImageLocation) arrayList4.get(i12);
                    n9Var = this.f27103g;
                    i11 = iK;
                    if (n9Var == null) {
                        bitmap = null;
                    } else {
                        bitmap = null;
                    }
                    StringBuilder sb3 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb3.append(ch0Var.A0);
                    string = sb3.toString();
                    if (bitmap == null) {
                        if (ch0Var.G0 != null) {
                            yg0Var.f34898c.o((w51) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ch0Var.G0, null, ((Integer) arrayList2.get(i12)).intValue(), string);
                        } else {
                            if (imageLocation == null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            yg0Var.f34898c.o((w51) arrayList5.get(i12), imageLocation2, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), str2, ((Integer) arrayList2.get(i12)).intValue(), string);
                        }
                    } else if (ch0Var.G0 != null) {
                        yg0Var.f34898c.o((w51) arrayList5.get(i12), (ImageLocation) arrayList6.get(i12), str, (ImageLocation) arrayList3.get(i12), ch0Var.G0, null, ((Integer) arrayList2.get(i12)).intValue(), string);
                    } else {
                        if (imageLocation == null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        yg0Var.f34898c.o((w51) arrayList5.get(i12), imageLocation2, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), str2, ((Integer) arrayList2.get(i12)).intValue(), string);
                    }
                    z10 = z11;
                }
                i11 = iK;
                sparseArray = sparseArray2;
                z10 = false;
            } else {
                if (i12 < 0) {
                }
                i11 = iK;
                sparseArray = sparseArray2;
                z10 = false;
            }
        } else {
            i11 = iK;
            sparseArray = sparseArray2;
            if (i12 < 0 || i12 >= arrayList6.size()) {
                z10 = false;
            } else {
                ImageLocation imageLocation5 = (ImageLocation) arrayList6.get(i12);
                yg0Var.f34898c.H = imageLocation5 != null;
                z10 = arrayList5.get(i12) == null;
                ImageLocation imageLocation6 = (ImageLocation) arrayList4.get(i12);
                yg0Var.f34898c.o((w51) arrayList5.get(i12), imageLocation5, null, (ImageLocation) arrayList3.get(i12), (ImageLocation) arrayList4.get(i12), (imageLocation6 == null || !(imageLocation6.photoSize instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ch0Var.A0);
            }
        }
        if ((i12 < 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            SparseArray sparseArray3 = sparseArray;
            yg0Var.f34898c.D = (RadialProgress2) sparseArray3.get(i12);
            wg0 wg0Var3 = yg0Var.f34898c;
            if (wg0Var3.D == null) {
                wg0Var3.D = new RadialProgress2(wg0Var3, null);
                RadialProgress2 radialProgress2 = yg0Var.f34898c.D;
                radialProgress2.E = 0.0f;
                radialProgress2.setIcon(10, false, false);
                yg0Var.f34898c.D.setColors(1107296256, 1107296256, -1, -1);
                sparseArray3.append(i12, yg0Var.f34898c.D);
            }
            if (ch0Var.f27434c1) {
                ch0Var.invalidate();
            } else {
                ch0Var.postInvalidateOnAnimation();
            }
        }
        yg0Var.f34898c.getImageReceiver().setDelegate(new ah0(this));
        yg0Var.f34898c.getImageReceiver().setCrossfadeAlpha((byte) 2);
        wg0 wg0Var4 = yg0Var.f34898c;
        int i13 = ch0Var.f27440i1;
        int i14 = ch0Var.f27441j1;
        wg0Var4.r(i13, i13, i14, i14);
        yg0Var.f34898c.setTag(Integer.valueOf(i11));
        return yg0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        yg0 yg0Var = (yg0) obj;
        if (yg0Var.f34896a) {
            return view == yg0Var.f34897b;
        }
        return view == yg0Var.f34898c;
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((n9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f27100c;
        arrayList2.clear();
        arrayList.clear();
        ch0 ch0Var = this.h;
        int size = ch0Var.T0.size();
        if (ch0Var.f27436e1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ch0Var.O0;
        int iJ = (j() * 2) + Math.max(dialogPhotos == null ? 0 : dialogPhotos.getCount(), size);
        for (int i11 = 0; i11 < iJ; i11++) {
            arrayList2.add(new yg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        ch0 ch0Var = this.h;
        int size = ch0Var.T0.size();
        if (ch0Var.f27436e1) {
            size++;
        }
        if (size >= 2) {
            return ch0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
