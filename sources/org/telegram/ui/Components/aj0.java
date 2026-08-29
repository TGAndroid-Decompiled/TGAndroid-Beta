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
public class aj0 extends ImageView {
    public HashMap f26787a;
    public xi0 f26788b;
    public yi0 f26789c;
    public boolean d;
    public boolean f26790e;
    public boolean f26791f;
    public Integer h;
    public boolean f26792n;

    public aj0(Context context) {
        super(context);
    }

    public final void a() {
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f26789c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f26789c = null;
        }
        this.f26788b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null && xi0Var.f34742h0) {
            return true;
        }
        return false;
    }

    public final void d() {
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null || this.f26789c != null) {
            this.f26791f = true;
            if (this.f26790e) {
                if (xi0Var != null) {
                    xi0Var.start();
                }
                yi0 yi0Var = this.f26789c;
                if (yi0Var != null) {
                    yi0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new xi0(i10, j7.l1.k(i10, ""), AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        yi0 yi0Var = this.f26789c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f26789c = null;
        }
        if (document != null) {
            yi0 yi0Var2 = new yi0(this);
            this.f26789c = yi0Var2;
            yi0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = com.google.android.recaptcha.internal.a.k(i10, "_", i11);
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f26792n) {
                this.f26789c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.k(i10, "_", i11), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                yi0 yi0Var3 = this.f26789c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                yi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f26789c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.k(i10, "_", i11), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f26789c.setAspectFit(true);
            this.f26789c.setParentView(this);
            if (this.d) {
                this.f26789c.setAutoRepeat(1);
                this.f26789c.setAllowStartLottieAnimation(true);
                this.f26789c.setAllowStartAnimation(true);
            } else {
                this.f26789c.setAutoRepeat(0);
            }
            yi0 yi0Var4 = this.f26789c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            yi0Var4.setLayerNum(i12);
            this.f26789c.clip = false;
            setImageDrawable(new zi0(this, i10, i11));
            if (this.f26790e) {
                this.f26789c.onAttachedToWindow();
            }
        }
    }

    public xi0 getAnimatedDrawable() {
        return this.f26788b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26789c;
    }

    public final void h(int i10, String str) {
        if (this.f26787a == null) {
            this.f26787a = new HashMap();
        }
        this.f26787a.put(str, Integer.valueOf(i10));
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null) {
            xi0Var.O(i10, str);
        }
    }

    public final void i() {
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null || this.f26789c != null) {
            this.f26791f = false;
            if (this.f26790e) {
                if (xi0Var != null) {
                    xi0Var.stop();
                }
                yi0 yi0Var = this.f26789c;
                if (yi0Var != null) {
                    yi0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26790e = true;
        yi0 yi0Var = this.f26789c;
        if (yi0Var != null) {
            yi0Var.onAttachedToWindow();
            if (this.f26791f) {
                this.f26789c.startAnimation();
            }
        }
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null) {
            xi0Var.setCallback(this);
            if (this.f26791f) {
                this.f26788b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26790e = false;
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f26789c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xi0 xi0Var) {
        if (this.f26788b == xi0Var) {
            return;
        }
        yi0 yi0Var = this.f26789c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f26789c = null;
        }
        this.f26788b = xi0Var;
        xi0Var.f34753r0 = this;
        if (this.d) {
            xi0Var.I(1);
        }
        HashMap hashMap = this.f26787a;
        if (hashMap != null) {
            this.f26788b.W = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xi0 xi0Var2 = this.f26788b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xi0Var2.f34754s.put((String) entry.getKey(), num);
                xi0Var2.E();
            }
            this.f26788b.m();
        }
        this.f26788b.H(true);
        setImageDrawable(this.f26788b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26788b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        yi0 yi0Var = this.f26789c;
        if (yi0Var != null) {
            yi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null) {
            xi0Var.f34751q0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26792n = z10;
    }

    public void setProgress(float f9) {
        xi0 xi0Var = this.f26788b;
        if (xi0Var != null) {
            xi0Var.Q(f9, true);
        }
    }

    public void c() {
    }
}
