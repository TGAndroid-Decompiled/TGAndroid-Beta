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
public class ak0 extends ImageView {
    public HashMap f26514a;
    public xj0 f26515b;
    public yj0 f26516c;
    public boolean d;
    public boolean e;
    public boolean f26517f;
    public Integer h;
    public boolean f26518n;

    public ak0(Context context) {
        super(context);
    }

    public final void a() {
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null) {
            xj0Var.stop();
        }
        yj0 yj0Var = this.f26516c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
            this.f26516c = null;
        }
        this.f26515b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null && xj0Var.f34746k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null || this.f26516c != null) {
            this.f26517f = true;
            if (this.e) {
                if (xj0Var != null) {
                    xj0Var.start();
                }
                yj0 yj0Var = this.f26516c;
                if (yj0Var != null) {
                    yj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new xj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        yj0 yj0Var = this.f26516c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
            this.f26516c = null;
        }
        if (document != null) {
            yj0 yj0Var2 = new yj0(this);
            this.f26516c = yj0Var2;
            yj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f26518n) {
                this.f26516c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                yj0 yj0Var3 = this.f26516c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                yj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23518m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f26516c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f26516c.setAspectFit(true);
            this.f26516c.setParentView(this);
            if (this.d) {
                this.f26516c.setAutoRepeat(1);
                this.f26516c.setAllowStartLottieAnimation(true);
                this.f26516c.setAllowStartAnimation(true);
            } else {
                this.f26516c.setAutoRepeat(0);
            }
            yj0 yj0Var4 = this.f26516c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            yj0Var4.setLayerNum(i12);
            this.f26516c.clip = false;
            setImageDrawable(new zj0(this, i10, i11));
            if (this.e) {
                this.f26516c.onAttachedToWindow();
            }
        }
    }

    public xj0 getAnimatedDrawable() {
        return this.f26515b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26516c;
    }

    public final void h(int i10, String str) {
        if (this.f26514a == null) {
            this.f26514a = new HashMap();
        }
        this.f26514a.put(str, Integer.valueOf(i10));
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null) {
            xj0Var.Q(i10, str);
        }
    }

    public final void i() {
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null || this.f26516c != null) {
            this.f26517f = false;
            if (this.e) {
                if (xj0Var != null) {
                    xj0Var.stop();
                }
                yj0 yj0Var = this.f26516c;
                if (yj0Var != null) {
                    yj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        yj0 yj0Var = this.f26516c;
        if (yj0Var != null) {
            yj0Var.onAttachedToWindow();
            if (this.f26517f) {
                this.f26516c.startAnimation();
            }
        }
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null) {
            xj0Var.setCallback(this);
            if (this.f26517f) {
                this.f26515b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null) {
            xj0Var.stop();
        }
        yj0 yj0Var = this.f26516c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xj0 xj0Var) {
        if (this.f26515b == xj0Var) {
            return;
        }
        yj0 yj0Var = this.f26516c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
            this.f26516c = null;
        }
        this.f26515b = xj0Var;
        xj0Var.R(this);
        if (this.d) {
            this.f26515b.K(1);
        }
        HashMap hashMap = this.f26514a;
        if (hashMap != null) {
            this.f26515b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xj0 xj0Var2 = this.f26515b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xj0Var2.f34755s.put((String) entry.getKey(), num);
                xj0Var2.G();
            }
            this.f26515b.o();
        }
        this.f26515b.J(true);
        setImageDrawable(this.f26515b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26515b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        yj0 yj0Var = this.f26516c;
        if (yj0Var != null) {
            yj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null) {
            xj0Var.f34757t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26518n = z10;
    }

    public void setProgress(float f7) {
        xj0 xj0Var = this.f26515b;
        if (xj0Var != null) {
            xj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
