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
public class mj0 extends ImageView {
    public HashMap f26430a;
    public jj0 f26431b;
    public kj0 f26432c;
    public boolean d;
    public boolean e;
    public boolean f26433f;
    public Integer h;
    public boolean f26434n;

    public mj0(Context context) {
        super(context);
    }

    public final void a() {
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null) {
            jj0Var.stop();
        }
        kj0 kj0Var = this.f26432c;
        if (kj0Var != null) {
            kj0Var.onDetachedFromWindow();
            this.f26432c = null;
        }
        this.f26431b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null && jj0Var.f25435k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null || this.f26432c != null) {
            this.f26433f = true;
            if (this.e) {
                if (jj0Var != null) {
                    jj0Var.start();
                }
                kj0 kj0Var = this.f26432c;
                if (kj0Var != null) {
                    kj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new jj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        kj0 kj0Var = this.f26432c;
        if (kj0Var != null) {
            kj0Var.onDetachedFromWindow();
            this.f26432c = null;
        }
        if (document != null) {
            kj0 kj0Var2 = new kj0(this);
            this.f26432c = kj0Var2;
            kj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f26434n) {
                this.f26432c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                kj0 kj0Var3 = this.f26432c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                kj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f19223m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f26432c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f26432c.setAspectFit(true);
            this.f26432c.setParentView(this);
            if (this.d) {
                this.f26432c.setAutoRepeat(1);
                this.f26432c.setAllowStartLottieAnimation(true);
                this.f26432c.setAllowStartAnimation(true);
            } else {
                this.f26432c.setAutoRepeat(0);
            }
            kj0 kj0Var4 = this.f26432c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            kj0Var4.setLayerNum(i12);
            this.f26432c.clip = false;
            setImageDrawable(new lj0(this, i10, i11));
            if (this.e) {
                this.f26432c.onAttachedToWindow();
            }
        }
    }

    public jj0 getAnimatedDrawable() {
        return this.f26431b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26432c;
    }

    public final void h(int i10, String str) {
        if (this.f26430a == null) {
            this.f26430a = new HashMap();
        }
        this.f26430a.put(str, Integer.valueOf(i10));
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null) {
            jj0Var.Q(i10, str);
        }
    }

    public final void i() {
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null || this.f26432c != null) {
            this.f26433f = false;
            if (this.e) {
                if (jj0Var != null) {
                    jj0Var.stop();
                }
                kj0 kj0Var = this.f26432c;
                if (kj0Var != null) {
                    kj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        kj0 kj0Var = this.f26432c;
        if (kj0Var != null) {
            kj0Var.onAttachedToWindow();
            if (this.f26433f) {
                this.f26432c.startAnimation();
            }
        }
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null) {
            jj0Var.setCallback(this);
            if (this.f26433f) {
                this.f26431b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null) {
            jj0Var.stop();
        }
        kj0 kj0Var = this.f26432c;
        if (kj0Var != null) {
            kj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(jj0 jj0Var) {
        if (this.f26431b == jj0Var) {
            return;
        }
        kj0 kj0Var = this.f26432c;
        if (kj0Var != null) {
            kj0Var.onDetachedFromWindow();
            this.f26432c = null;
        }
        this.f26431b = jj0Var;
        jj0Var.R(this);
        if (this.d) {
            this.f26431b.K(1);
        }
        HashMap hashMap = this.f26430a;
        if (hashMap != null) {
            this.f26431b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                jj0 jj0Var2 = this.f26431b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                jj0Var2.f25444s.put((String) entry.getKey(), num);
                jj0Var2.G();
            }
            this.f26431b.o();
        }
        this.f26431b.J(true);
        setImageDrawable(this.f26431b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26431b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        kj0 kj0Var = this.f26432c;
        if (kj0Var != null) {
            kj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null) {
            jj0Var.f25446t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26434n = z10;
    }

    public void setProgress(float f7) {
        jj0 jj0Var = this.f26431b;
        if (jj0Var != null) {
            jj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
