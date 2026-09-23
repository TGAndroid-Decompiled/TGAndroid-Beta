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
public class bj0 extends ImageView {
    public HashMap f22769a;
    public yi0 f22770b;
    public zi0 f22771c;
    public boolean d;
    public boolean e;
    public boolean f22772f;
    public Integer h;
    public boolean f22773n;

    public bj0(Context context) {
        super(context);
    }

    public final void a() {
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null) {
            yi0Var.stop();
        }
        zi0 zi0Var = this.f22771c;
        if (zi0Var != null) {
            zi0Var.onDetachedFromWindow();
            this.f22771c = null;
        }
        this.f22770b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null && yi0Var.f30271k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null || this.f22771c != null) {
            this.f22772f = true;
            if (this.e) {
                if (yi0Var != null) {
                    yi0Var.start();
                }
                zi0 zi0Var = this.f22771c;
                if (zi0Var != null) {
                    zi0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new yi0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        zi0 zi0Var = this.f22771c;
        if (zi0Var != null) {
            zi0Var.onDetachedFromWindow();
            this.f22771c = null;
        }
        if (document != null) {
            zi0 zi0Var2 = new zi0(this);
            this.f22771c = zi0Var2;
            zi0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = a4.a.l(i10, i11, "_");
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f22773n) {
                this.f22771c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                zi0 zi0Var3 = this.f22771c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                zi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f18953m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f22771c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f22771c.setAspectFit(true);
            this.f22771c.setParentView(this);
            if (this.d) {
                this.f22771c.setAutoRepeat(1);
                this.f22771c.setAllowStartLottieAnimation(true);
                this.f22771c.setAllowStartAnimation(true);
            } else {
                this.f22771c.setAutoRepeat(0);
            }
            zi0 zi0Var4 = this.f22771c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            zi0Var4.setLayerNum(i12);
            this.f22771c.clip = false;
            setImageDrawable(new aj0(this, i10, i11));
            if (this.e) {
                this.f22771c.onAttachedToWindow();
            }
        }
    }

    public yi0 getAnimatedDrawable() {
        return this.f22770b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f22771c;
    }

    public final void h(int i10, String str) {
        if (this.f22769a == null) {
            this.f22769a = new HashMap();
        }
        this.f22769a.put(str, Integer.valueOf(i10));
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null) {
            yi0Var.Q(i10, str);
        }
    }

    public final void i() {
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null || this.f22771c != null) {
            this.f22772f = false;
            if (this.e) {
                if (yi0Var != null) {
                    yi0Var.stop();
                }
                zi0 zi0Var = this.f22771c;
                if (zi0Var != null) {
                    zi0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        zi0 zi0Var = this.f22771c;
        if (zi0Var != null) {
            zi0Var.onAttachedToWindow();
            if (this.f22772f) {
                this.f22771c.startAnimation();
            }
        }
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null) {
            yi0Var.setCallback(this);
            if (this.f22772f) {
                this.f22770b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null) {
            yi0Var.stop();
        }
        zi0 zi0Var = this.f22771c;
        if (zi0Var != null) {
            zi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(yi0 yi0Var) {
        if (this.f22770b == yi0Var) {
            return;
        }
        zi0 zi0Var = this.f22771c;
        if (zi0Var != null) {
            zi0Var.onDetachedFromWindow();
            this.f22771c = null;
        }
        this.f22770b = yi0Var;
        yi0Var.R(this);
        if (this.d) {
            this.f22770b.K(1);
        }
        HashMap hashMap = this.f22769a;
        if (hashMap != null) {
            this.f22770b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                yi0 yi0Var2 = this.f22770b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                yi0Var2.f30280s.put((String) entry.getKey(), num);
                yi0Var2.G();
            }
            this.f22770b.o();
        }
        this.f22770b.J(true);
        setImageDrawable(this.f22770b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f22770b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        zi0 zi0Var = this.f22771c;
        if (zi0Var != null) {
            zi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null) {
            yi0Var.f30282t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f22773n = z10;
    }

    public void setProgress(float f7) {
        yi0 yi0Var = this.f22770b;
        if (yi0Var != null) {
            yi0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
