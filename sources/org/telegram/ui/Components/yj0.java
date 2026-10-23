package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public class yj0 extends ImageView {
    public HashMap f32668a;
    public vj0 f32669b;
    public wj0 f32670c;
    public boolean d;
    public boolean e;
    public boolean f32671f;
    public Integer h;
    public boolean f32672n;

    public yj0(Context context) {
        super(context);
    }

    public final void a() {
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null) {
            vj0Var.stop();
        }
        wj0 wj0Var = this.f32670c;
        if (wj0Var != null) {
            wj0Var.onDetachedFromWindow();
            this.f32670c = null;
        }
        this.f32669b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null && vj0Var.f31282k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null || this.f32670c != null) {
            this.f32671f = true;
            if (this.e) {
                if (vj0Var != null) {
                    vj0Var.start();
                }
                wj0 wj0Var = this.f32670c;
                if (wj0Var != null) {
                    wj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new vj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        wj0 wj0Var = this.f32670c;
        if (wj0Var != null) {
            wj0Var.onDetachedFromWindow();
            this.f32670c = null;
        }
        if (document != null) {
            wj0 wj0Var2 = new wj0(this);
            this.f32670c = wj0Var2;
            wj0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = a1.g.k(i10, i11, "_");
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f32672n) {
                this.f32670c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                wj0 wj0Var3 = this.f32670c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                wj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21157m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f32670c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f32670c.setAspectFit(true);
            this.f32670c.setParentView(this);
            if (this.d) {
                this.f32670c.setAutoRepeat(1);
                this.f32670c.setAllowStartLottieAnimation(true);
                this.f32670c.setAllowStartAnimation(true);
            } else {
                this.f32670c.setAutoRepeat(0);
            }
            wj0 wj0Var4 = this.f32670c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            wj0Var4.setLayerNum(i12);
            this.f32670c.clip = false;
            setImageDrawable(new xj0(this, i10, i11));
            if (this.e) {
                this.f32670c.onAttachedToWindow();
            }
        }
    }

    public vj0 getAnimatedDrawable() {
        return this.f32669b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32670c;
    }

    public final void h(int i10, String str) {
        if (this.f32668a == null) {
            this.f32668a = new HashMap();
        }
        this.f32668a.put(str, Integer.valueOf(i10));
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null) {
            vj0Var.Q(i10, str);
        }
    }

    public final void i() {
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null || this.f32670c != null) {
            this.f32671f = false;
            if (this.e) {
                if (vj0Var != null) {
                    vj0Var.stop();
                }
                wj0 wj0Var = this.f32670c;
                if (wj0Var != null) {
                    wj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        wj0 wj0Var = this.f32670c;
        if (wj0Var != null) {
            wj0Var.onAttachedToWindow();
            if (this.f32671f) {
                this.f32670c.startAnimation();
            }
        }
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null) {
            vj0Var.setCallback(this);
            if (this.f32671f) {
                this.f32669b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null) {
            vj0Var.stop();
        }
        wj0 wj0Var = this.f32670c;
        if (wj0Var != null) {
            wj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(vj0 vj0Var) {
        if (this.f32669b == vj0Var) {
            return;
        }
        wj0 wj0Var = this.f32670c;
        if (wj0Var != null) {
            wj0Var.onDetachedFromWindow();
            this.f32670c = null;
        }
        this.f32669b = vj0Var;
        vj0Var.R(this);
        if (this.d) {
            this.f32669b.K(1);
        }
        HashMap hashMap = this.f32668a;
        if (hashMap != null) {
            this.f32669b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                vj0 vj0Var2 = this.f32669b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                vj0Var2.f31291s.put((String) entry.getKey(), num);
                vj0Var2.G();
            }
            this.f32669b.o();
        }
        this.f32669b.J(true);
        setImageDrawable(this.f32669b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f32669b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        wj0 wj0Var = this.f32670c;
        if (wj0Var != null) {
            wj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null) {
            vj0Var.f31293t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f32672n = z10;
    }

    public void setProgress(float f7) {
        vj0 vj0Var = this.f32669b;
        if (vj0Var != null) {
            vj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
