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
    public HashMap f22422a;
    public xi0 f22423b;
    public yi0 f22424c;
    public boolean d;
    public boolean e;
    public boolean f22425f;
    public Integer h;
    public boolean f22426n;

    public aj0(Context context) {
        super(context);
    }

    public final void a() {
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f22424c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f22424c = null;
        }
        this.f22423b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null && xi0Var.f29956k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null || this.f22424c != null) {
            this.f22425f = true;
            if (this.e) {
                if (xi0Var != null) {
                    xi0Var.start();
                }
                yi0 yi0Var = this.f22424c;
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
        setAnimation(new xi0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        yi0 yi0Var = this.f22424c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f22424c = null;
        }
        if (document != null) {
            yi0 yi0Var2 = new yi0(this);
            this.f22424c = yi0Var2;
            yi0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f22426n) {
                this.f22424c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                yi0 yi0Var3 = this.f22424c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                yi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f22424c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f22424c.setAspectFit(true);
            this.f22424c.setParentView(this);
            if (this.d) {
                this.f22424c.setAutoRepeat(1);
                this.f22424c.setAllowStartLottieAnimation(true);
                this.f22424c.setAllowStartAnimation(true);
            } else {
                this.f22424c.setAutoRepeat(0);
            }
            yi0 yi0Var4 = this.f22424c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            yi0Var4.setLayerNum(i12);
            this.f22424c.clip = false;
            setImageDrawable(new zi0(this, i10, i11));
            if (this.e) {
                this.f22424c.onAttachedToWindow();
            }
        }
    }

    public xi0 getAnimatedDrawable() {
        return this.f22423b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f22424c;
    }

    public final void h(int i10, String str) {
        if (this.f22422a == null) {
            this.f22422a = new HashMap();
        }
        this.f22422a.put(str, Integer.valueOf(i10));
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null) {
            xi0Var.Q(i10, str);
        }
    }

    public final void i() {
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null || this.f22424c != null) {
            this.f22425f = false;
            if (this.e) {
                if (xi0Var != null) {
                    xi0Var.stop();
                }
                yi0 yi0Var = this.f22424c;
                if (yi0Var != null) {
                    yi0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        yi0 yi0Var = this.f22424c;
        if (yi0Var != null) {
            yi0Var.onAttachedToWindow();
            if (this.f22425f) {
                this.f22424c.startAnimation();
            }
        }
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null) {
            xi0Var.setCallback(this);
            if (this.f22425f) {
                this.f22423b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f22424c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xi0 xi0Var) {
        if (this.f22423b == xi0Var) {
            return;
        }
        yi0 yi0Var = this.f22424c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f22424c = null;
        }
        this.f22423b = xi0Var;
        xi0Var.R(this);
        if (this.d) {
            this.f22423b.K(1);
        }
        HashMap hashMap = this.f22422a;
        if (hashMap != null) {
            this.f22423b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xi0 xi0Var2 = this.f22423b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xi0Var2.f29965s.put((String) entry.getKey(), num);
                xi0Var2.G();
            }
            this.f22423b.o();
        }
        this.f22423b.J(true);
        setImageDrawable(this.f22423b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f22423b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        yi0 yi0Var = this.f22424c;
        if (yi0Var != null) {
            yi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null) {
            xi0Var.f29967t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f22426n = z10;
    }

    public void setProgress(float f7) {
        xi0 xi0Var = this.f22423b;
        if (xi0Var != null) {
            xi0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
