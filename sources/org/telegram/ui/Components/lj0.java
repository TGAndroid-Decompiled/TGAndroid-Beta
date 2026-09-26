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
public class lj0 extends ImageView {
    public HashMap f26118a;
    public ij0 f26119b;
    public jj0 f26120c;
    public boolean d;
    public boolean e;
    public boolean f26121f;
    public Integer h;
    public boolean f26122n;

    public lj0(Context context) {
        super(context);
    }

    public final void a() {
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null) {
            ij0Var.stop();
        }
        jj0 jj0Var = this.f26120c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.f26120c = null;
        }
        this.f26119b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null && ij0Var.f25081k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null || this.f26120c != null) {
            this.f26121f = true;
            if (this.e) {
                if (ij0Var != null) {
                    ij0Var.start();
                }
                jj0 jj0Var = this.f26120c;
                if (jj0Var != null) {
                    jj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ij0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        jj0 jj0Var = this.f26120c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.f26120c = null;
        }
        if (document != null) {
            jj0 jj0Var2 = new jj0(this);
            this.f26120c = jj0Var2;
            jj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f26122n) {
                this.f26120c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                jj0 jj0Var3 = this.f26120c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                jj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f19223m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f26120c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f26120c.setAspectFit(true);
            this.f26120c.setParentView(this);
            if (this.d) {
                this.f26120c.setAutoRepeat(1);
                this.f26120c.setAllowStartLottieAnimation(true);
                this.f26120c.setAllowStartAnimation(true);
            } else {
                this.f26120c.setAutoRepeat(0);
            }
            jj0 jj0Var4 = this.f26120c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            jj0Var4.setLayerNum(i12);
            this.f26120c.clip = false;
            setImageDrawable(new kj0(this, i10, i11));
            if (this.e) {
                this.f26120c.onAttachedToWindow();
            }
        }
    }

    public ij0 getAnimatedDrawable() {
        return this.f26119b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26120c;
    }

    public final void h(int i10, String str) {
        if (this.f26118a == null) {
            this.f26118a = new HashMap();
        }
        this.f26118a.put(str, Integer.valueOf(i10));
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null) {
            ij0Var.Q(i10, str);
        }
    }

    public final void i() {
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null || this.f26120c != null) {
            this.f26121f = false;
            if (this.e) {
                if (ij0Var != null) {
                    ij0Var.stop();
                }
                jj0 jj0Var = this.f26120c;
                if (jj0Var != null) {
                    jj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        jj0 jj0Var = this.f26120c;
        if (jj0Var != null) {
            jj0Var.onAttachedToWindow();
            if (this.f26121f) {
                this.f26120c.startAnimation();
            }
        }
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null) {
            ij0Var.setCallback(this);
            if (this.f26121f) {
                this.f26119b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null) {
            ij0Var.stop();
        }
        jj0 jj0Var = this.f26120c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(ij0 ij0Var) {
        if (this.f26119b == ij0Var) {
            return;
        }
        jj0 jj0Var = this.f26120c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.f26120c = null;
        }
        this.f26119b = ij0Var;
        ij0Var.R(this);
        if (this.d) {
            this.f26119b.K(1);
        }
        HashMap hashMap = this.f26118a;
        if (hashMap != null) {
            this.f26119b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ij0 ij0Var2 = this.f26119b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ij0Var2.f25090s.put((String) entry.getKey(), num);
                ij0Var2.G();
            }
            this.f26119b.o();
        }
        this.f26119b.J(true);
        setImageDrawable(this.f26119b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26119b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        jj0 jj0Var = this.f26120c;
        if (jj0Var != null) {
            jj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null) {
            ij0Var.f25092t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26122n = z10;
    }

    public void setProgress(float f7) {
        ij0 ij0Var = this.f26119b;
        if (ij0Var != null) {
            ij0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
