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
    public HashMap f28998a;
    public kj0 f28999b;
    public lj0 f29000c;
    public boolean d;
    public boolean f29001e;
    public boolean f29002f;
    public Integer h;
    public boolean f29003n;

    public nj0(Context context) {
        super(context);
    }

    public final void a() {
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.f29000c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f29000c = null;
        }
        this.f28999b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null && kj0Var.f28138k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null || this.f29000c != null) {
            this.f29002f = true;
            if (this.f29001e) {
                if (kj0Var != null) {
                    kj0Var.start();
                }
                lj0 lj0Var = this.f29000c;
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
        lj0 lj0Var = this.f29000c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f29000c = null;
        }
        if (document != null) {
            lj0 lj0Var2 = new lj0(this);
            this.f29000c = lj0Var2;
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
            if (this.f29003n) {
                this.f29000c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                lj0 lj0Var3 = this.f29000c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                lj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20988m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f29000c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f29000c.setAspectFit(true);
            this.f29000c.setParentView(this);
            if (this.d) {
                this.f29000c.setAutoRepeat(1);
                this.f29000c.setAllowStartLottieAnimation(true);
                this.f29000c.setAllowStartAnimation(true);
            } else {
                this.f29000c.setAutoRepeat(0);
            }
            lj0 lj0Var4 = this.f29000c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            lj0Var4.setLayerNum(i12);
            this.f29000c.clip = false;
            setImageDrawable(new mj0(this, i10, i11));
            if (this.f29001e) {
                this.f29000c.onAttachedToWindow();
            }
        }
    }

    public kj0 getAnimatedDrawable() {
        return this.f28999b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f29000c;
    }

    public final void h(int i10, String str) {
        if (this.f28998a == null) {
            this.f28998a = new HashMap();
        }
        this.f28998a.put(str, Integer.valueOf(i10));
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null) {
            kj0Var.Q(i10, str);
        }
    }

    public final void i() {
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null || this.f29000c != null) {
            this.f29002f = false;
            if (this.f29001e) {
                if (kj0Var != null) {
                    kj0Var.stop();
                }
                lj0 lj0Var = this.f29000c;
                if (lj0Var != null) {
                    lj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29001e = true;
        lj0 lj0Var = this.f29000c;
        if (lj0Var != null) {
            lj0Var.onAttachedToWindow();
            if (this.f29002f) {
                this.f29000c.startAnimation();
            }
        }
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null) {
            kj0Var.setCallback(this);
            if (this.f29002f) {
                this.f28999b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29001e = false;
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.f29000c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(kj0 kj0Var) {
        if (this.f28999b == kj0Var) {
            return;
        }
        lj0 lj0Var = this.f29000c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f29000c = null;
        }
        this.f28999b = kj0Var;
        kj0Var.R(this);
        if (this.d) {
            this.f28999b.K(1);
        }
        HashMap hashMap = this.f28998a;
        if (hashMap != null) {
            this.f28999b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                kj0 kj0Var2 = this.f28999b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                kj0Var2.f28147s.put((String) entry.getKey(), num);
                kj0Var2.G();
            }
            this.f28999b.o();
        }
        this.f28999b.J(true);
        setImageDrawable(this.f28999b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f28999b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        lj0 lj0Var = this.f29000c;
        if (lj0Var != null) {
            lj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null) {
            kj0Var.f28149t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f29003n = z10;
    }

    public void setProgress(float f7) {
        kj0 kj0Var = this.f28999b;
        if (kj0Var != null) {
            kj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
