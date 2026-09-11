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
    public HashMap f24405a;
    public xi0 f24406b;
    public yi0 f24407c;
    public boolean d;
    public boolean f24408e;
    public boolean f24409f;
    public Integer h;
    public boolean f24410n;

    public aj0(Context context) {
        super(context);
    }

    public final void a() {
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f24407c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f24407c = null;
        }
        this.f24406b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null && xi0Var.f32566l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null || this.f24407c != null) {
            this.f24409f = true;
            if (this.f24408e) {
                if (xi0Var != null) {
                    xi0Var.start();
                }
                yi0 yi0Var = this.f24407c;
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
        yi0 yi0Var = this.f24407c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f24407c = null;
        }
        if (document != null) {
            yi0 yi0Var2 = new yi0(this);
            this.f24407c = yi0Var2;
            yi0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f24410n) {
                this.f24407c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                yi0 yi0Var3 = this.f24407c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                yi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f24407c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f24407c.setAspectFit(true);
            this.f24407c.setParentView(this);
            if (this.d) {
                this.f24407c.setAutoRepeat(1);
                this.f24407c.setAllowStartLottieAnimation(true);
                this.f24407c.setAllowStartAnimation(true);
            } else {
                this.f24407c.setAutoRepeat(0);
            }
            yi0 yi0Var4 = this.f24407c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            yi0Var4.setLayerNum(i12);
            this.f24407c.clip = false;
            setImageDrawable(new zi0(this, i10, i11));
            if (this.f24408e) {
                this.f24407c.onAttachedToWindow();
            }
        }
    }

    public xi0 getAnimatedDrawable() {
        return this.f24406b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f24407c;
    }

    public final void h(int i10, String str) {
        if (this.f24405a == null) {
            this.f24405a = new HashMap();
        }
        this.f24405a.put(str, Integer.valueOf(i10));
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null) {
            xi0Var.O(i10, str);
        }
    }

    public final void i() {
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null || this.f24407c != null) {
            this.f24409f = false;
            if (this.f24408e) {
                if (xi0Var != null) {
                    xi0Var.stop();
                }
                yi0 yi0Var = this.f24407c;
                if (yi0Var != null) {
                    yi0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24408e = true;
        yi0 yi0Var = this.f24407c;
        if (yi0Var != null) {
            yi0Var.onAttachedToWindow();
            if (this.f24409f) {
                this.f24407c.startAnimation();
            }
        }
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null) {
            xi0Var.setCallback(this);
            if (this.f24409f) {
                this.f24406b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24408e = false;
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f24407c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xi0 xi0Var) {
        if (this.f24406b == xi0Var) {
            return;
        }
        yi0 yi0Var = this.f24407c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f24407c = null;
        }
        this.f24406b = xi0Var;
        xi0Var.f32578v0 = this;
        if (this.d) {
            xi0Var.I(1);
        }
        HashMap hashMap = this.f24405a;
        if (hashMap != null) {
            this.f24406b.f32551a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xi0 xi0Var2 = this.f24406b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xi0Var2.f32574s.put((String) entry.getKey(), num);
                xi0Var2.E();
            }
            this.f24406b.m();
        }
        this.f24406b.H(true);
        setImageDrawable(this.f24406b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f24406b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        yi0 yi0Var = this.f24407c;
        if (yi0Var != null) {
            yi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null) {
            xi0Var.f32577u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f24410n = z10;
    }

    public void setProgress(float f7) {
        xi0 xi0Var = this.f24406b;
        if (xi0Var != null) {
            xi0Var.Q(f7, true);
        }
    }

    public void c() {
    }
}
