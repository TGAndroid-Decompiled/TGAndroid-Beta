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
    public HashMap f28993a;
    public kj0 f28994b;
    public lj0 f28995c;
    public boolean d;
    public boolean f28996e;
    public boolean f28997f;
    public Integer h;
    public boolean f28998n;

    public nj0(Context context) {
        super(context);
    }

    public final void a() {
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.f28995c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f28995c = null;
        }
        this.f28994b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null && kj0Var.f28133k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null || this.f28995c != null) {
            this.f28997f = true;
            if (this.f28996e) {
                if (kj0Var != null) {
                    kj0Var.start();
                }
                lj0 lj0Var = this.f28995c;
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
        lj0 lj0Var = this.f28995c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f28995c = null;
        }
        if (document != null) {
            lj0 lj0Var2 = new lj0(this);
            this.f28995c = lj0Var2;
            lj0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = a4.a.k(i10, i11, "_");
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f28998n) {
                this.f28995c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                lj0 lj0Var3 = this.f28995c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                lj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20984m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f28995c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f28995c.setAspectFit(true);
            this.f28995c.setParentView(this);
            if (this.d) {
                this.f28995c.setAutoRepeat(1);
                this.f28995c.setAllowStartLottieAnimation(true);
                this.f28995c.setAllowStartAnimation(true);
            } else {
                this.f28995c.setAutoRepeat(0);
            }
            lj0 lj0Var4 = this.f28995c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            lj0Var4.setLayerNum(i12);
            this.f28995c.clip = false;
            setImageDrawable(new mj0(this, i10, i11));
            if (this.f28996e) {
                this.f28995c.onAttachedToWindow();
            }
        }
    }

    public kj0 getAnimatedDrawable() {
        return this.f28994b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f28995c;
    }

    public final void h(int i10, String str) {
        if (this.f28993a == null) {
            this.f28993a = new HashMap();
        }
        this.f28993a.put(str, Integer.valueOf(i10));
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null) {
            kj0Var.Q(i10, str);
        }
    }

    public final void i() {
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null || this.f28995c != null) {
            this.f28997f = false;
            if (this.f28996e) {
                if (kj0Var != null) {
                    kj0Var.stop();
                }
                lj0 lj0Var = this.f28995c;
                if (lj0Var != null) {
                    lj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28996e = true;
        lj0 lj0Var = this.f28995c;
        if (lj0Var != null) {
            lj0Var.onAttachedToWindow();
            if (this.f28997f) {
                this.f28995c.startAnimation();
            }
        }
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null) {
            kj0Var.setCallback(this);
            if (this.f28997f) {
                this.f28994b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28996e = false;
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null) {
            kj0Var.stop();
        }
        lj0 lj0Var = this.f28995c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(kj0 kj0Var) {
        if (this.f28994b == kj0Var) {
            return;
        }
        lj0 lj0Var = this.f28995c;
        if (lj0Var != null) {
            lj0Var.onDetachedFromWindow();
            this.f28995c = null;
        }
        this.f28994b = kj0Var;
        kj0Var.R(this);
        if (this.d) {
            this.f28994b.K(1);
        }
        HashMap hashMap = this.f28993a;
        if (hashMap != null) {
            this.f28994b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                kj0 kj0Var2 = this.f28994b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                kj0Var2.f28142s.put((String) entry.getKey(), num);
                kj0Var2.G();
            }
            this.f28994b.o();
        }
        this.f28994b.J(true);
        setImageDrawable(this.f28994b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f28994b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        lj0 lj0Var = this.f28995c;
        if (lj0Var != null) {
            lj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null) {
            kj0Var.f28144t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f28998n = z10;
    }

    public void setProgress(float f7) {
        kj0 kj0Var = this.f28994b;
        if (kj0Var != null) {
            kj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
