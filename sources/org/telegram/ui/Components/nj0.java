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
public class nj0 extends ImageView {
    public HashMap f29087a;
    public kj0 f29088b;
    public lj0 f29089c;
    public boolean d;
    public boolean f29090e;
    public boolean f29091f;
    public Integer h;
    public boolean f29092n;

    public nj0(Context context) {
        super(context);
    }

    public final void a() {
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.f29089c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f29089c = null;
        }
        this.f29088b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null && kj0Var.f28224k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null || this.f29089c != null) {
            this.f29091f = true;
            if (this.f29090e) {
                if (kj0Var != null) {
                    kj0Var.start();
                }
                lj0 lj0Var = this.f29089c;
                if (lj0Var != null) {
                    lj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new kj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        lj0 lj0Var = this.f29089c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f29089c = null;
        }
        if (document != null) {
            lj0 lj0Var2 = new lj0(this);
            this.f29089c = lj0Var2;
            lj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f29092n) {
                this.f29089c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                lj0 lj0Var3 = this.f29089c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                lj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20993m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f29089c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f29089c.setAspectFit(true);
            this.f29089c.setParentView(this);
            if (this.d) {
                this.f29089c.setAutoRepeat(1);
                this.f29089c.setAllowStartLottieAnimation(true);
                this.f29089c.setAllowStartAnimation(true);
            } else {
                this.f29089c.setAutoRepeat(0);
            }
            lj0 lj0Var4 = this.f29089c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            lj0Var4.setLayerNum(i12);
            this.f29089c.clip = false;
            setImageDrawable(new mj0(this, i10, i11));
            if (this.f29090e) {
                this.f29089c.onAttachedToWindow();
            }
        }
    }

    public kj0 getAnimatedDrawable() {
        return this.f29088b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f29089c;
    }

    public final void h(int i10, String str) {
        if (this.f29087a == null) {
            this.f29087a = new HashMap();
        }
        this.f29087a.put(str, Integer.valueOf(i10));
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null) {
            kj0Var.Q(i10, str);
        }
    }

    public final void i() {
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null || this.f29089c != null) {
            this.f29091f = false;
            if (this.f29090e) {
                if (kj0Var != null) {
                    kj0Var.stop();
                }
                lj0 lj0Var = this.f29089c;
                if (lj0Var != null) {
                    lj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29090e = true;
        lj0 lj0Var = this.f29089c;
        if (lj0Var != null) {
            lj0Var.onAttachedToWindow();
            if (this.f29091f) {
                this.f29089c.startAnimation();
            }
        }
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null) {
            kj0Var.setCallback(this);
            if (this.f29091f) {
                this.f29088b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29090e = false;
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.f29089c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(kj0 kj0Var) {
        if (this.f29088b == kj0Var) {
            return;
        }
        lj0 lj0Var = this.f29089c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f29089c = null;
        }
        this.f29088b = kj0Var;
        kj0Var.R(this);
        if (this.d) {
            this.f29088b.K(1);
        }
        HashMap hashMap = this.f29087a;
        if (hashMap != null) {
            this.f29088b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                kj0 kj0Var2 = this.f29088b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                kj0Var2.f28233s.put((String) entry.getKey(), num);
                kj0Var2.G();
            }
            this.f29088b.o();
        }
        this.f29088b.J(true);
        setImageDrawable(this.f29088b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f29088b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        lj0 lj0Var = this.f29089c;
        if (lj0Var != null) {
            lj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null) {
            kj0Var.f28235t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f29092n = z10;
    }

    public void setProgress(float f7) {
        kj0 kj0Var = this.f29088b;
        if (kj0Var != null) {
            kj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
