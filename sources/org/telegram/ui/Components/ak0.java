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
    public HashMap f24740a;
    public xj0 f24741b;
    public yj0 f24742c;
    public boolean d;
    public boolean e;
    public boolean f24743f;
    public Integer h;
    public boolean f24744n;

    public ak0(Context context) {
        super(context);
    }

    public final void a() {
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null) {
            xj0Var.stop();
        }
        yj0 yj0Var = this.f24742c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
            this.f24742c = null;
        }
        this.f24741b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null && xj0Var.f32607k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null || this.f24742c != null) {
            this.f24743f = true;
            if (this.e) {
                if (xj0Var != null) {
                    xj0Var.start();
                }
                yj0 yj0Var = this.f24742c;
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
        yj0 yj0Var = this.f24742c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
            this.f24742c = null;
        }
        if (document != null) {
            yj0 yj0Var2 = new yj0(this);
            this.f24742c = yj0Var2;
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
            if (this.f24744n) {
                this.f24742c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                yj0 yj0Var3 = this.f24742c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                yj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21347m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f24742c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f24742c.setAspectFit(true);
            this.f24742c.setParentView(this);
            if (this.d) {
                this.f24742c.setAutoRepeat(1);
                this.f24742c.setAllowStartLottieAnimation(true);
                this.f24742c.setAllowStartAnimation(true);
            } else {
                this.f24742c.setAutoRepeat(0);
            }
            yj0 yj0Var4 = this.f24742c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            yj0Var4.setLayerNum(i12);
            this.f24742c.clip = false;
            setImageDrawable(new zj0(this, i10, i11));
            if (this.e) {
                this.f24742c.onAttachedToWindow();
            }
        }
    }

    public xj0 getAnimatedDrawable() {
        return this.f24741b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f24742c;
    }

    public final void h(int i10, String str) {
        if (this.f24740a == null) {
            this.f24740a = new HashMap();
        }
        this.f24740a.put(str, Integer.valueOf(i10));
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null) {
            xj0Var.Q(i10, str);
        }
    }

    public final void i() {
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null || this.f24742c != null) {
            this.f24743f = false;
            if (this.e) {
                if (xj0Var != null) {
                    xj0Var.stop();
                }
                yj0 yj0Var = this.f24742c;
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
        yj0 yj0Var = this.f24742c;
        if (yj0Var != null) {
            yj0Var.onAttachedToWindow();
            if (this.f24743f) {
                this.f24742c.startAnimation();
            }
        }
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null) {
            xj0Var.setCallback(this);
            if (this.f24743f) {
                this.f24741b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null) {
            xj0Var.stop();
        }
        yj0 yj0Var = this.f24742c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xj0 xj0Var) {
        if (this.f24741b == xj0Var) {
            return;
        }
        yj0 yj0Var = this.f24742c;
        if (yj0Var != null) {
            yj0Var.onDetachedFromWindow();
            this.f24742c = null;
        }
        this.f24741b = xj0Var;
        xj0Var.R(this);
        if (this.d) {
            this.f24741b.K(1);
        }
        HashMap hashMap = this.f24740a;
        if (hashMap != null) {
            this.f24741b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xj0 xj0Var2 = this.f24741b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xj0Var2.f32616s.put((String) entry.getKey(), num);
                xj0Var2.G();
            }
            this.f24741b.o();
        }
        this.f24741b.J(true);
        setImageDrawable(this.f24741b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f24741b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        yj0 yj0Var = this.f24742c;
        if (yj0Var != null) {
            yj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null) {
            xj0Var.f32618t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f24744n = z10;
    }

    public void setProgress(float f7) {
        xj0 xj0Var = this.f24741b;
        if (xj0Var != null) {
            xj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
