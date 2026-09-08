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
    public HashMap f24432a;
    public xi0 f24433b;
    public yi0 f24434c;
    public boolean d;
    public boolean f24435e;
    public boolean f24436f;
    public Integer h;
    public boolean f24437n;

    public aj0(Context context) {
        super(context);
    }

    public final void a() {
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f24434c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f24434c = null;
        }
        this.f24433b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null && xi0Var.f32593l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null || this.f24434c != null) {
            this.f24436f = true;
            if (this.f24435e) {
                if (xi0Var != null) {
                    xi0Var.start();
                }
                yi0 yi0Var = this.f24434c;
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
        yi0 yi0Var = this.f24434c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f24434c = null;
        }
        if (document != null) {
            yi0 yi0Var2 = new yi0(this);
            this.f24434c = yi0Var2;
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
            if (this.f24437n) {
                this.f24434c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                yi0 yi0Var3 = this.f24434c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                yi0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20854m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f24434c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f24434c.setAspectFit(true);
            this.f24434c.setParentView(this);
            if (this.d) {
                this.f24434c.setAutoRepeat(1);
                this.f24434c.setAllowStartLottieAnimation(true);
                this.f24434c.setAllowStartAnimation(true);
            } else {
                this.f24434c.setAutoRepeat(0);
            }
            yi0 yi0Var4 = this.f24434c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            yi0Var4.setLayerNum(i12);
            this.f24434c.clip = false;
            setImageDrawable(new zi0(this, i10, i11));
            if (this.f24435e) {
                this.f24434c.onAttachedToWindow();
            }
        }
    }

    public xi0 getAnimatedDrawable() {
        return this.f24433b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f24434c;
    }

    public final void h(int i10, String str) {
        if (this.f24432a == null) {
            this.f24432a = new HashMap();
        }
        this.f24432a.put(str, Integer.valueOf(i10));
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null) {
            xi0Var.O(i10, str);
        }
    }

    public final void i() {
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null || this.f24434c != null) {
            this.f24436f = false;
            if (this.f24435e) {
                if (xi0Var != null) {
                    xi0Var.stop();
                }
                yi0 yi0Var = this.f24434c;
                if (yi0Var != null) {
                    yi0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24435e = true;
        yi0 yi0Var = this.f24434c;
        if (yi0Var != null) {
            yi0Var.onAttachedToWindow();
            if (this.f24436f) {
                this.f24434c.startAnimation();
            }
        }
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null) {
            xi0Var.setCallback(this);
            if (this.f24436f) {
                this.f24433b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24435e = false;
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null) {
            xi0Var.stop();
        }
        yi0 yi0Var = this.f24434c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(xi0 xi0Var) {
        if (this.f24433b == xi0Var) {
            return;
        }
        yi0 yi0Var = this.f24434c;
        if (yi0Var != null) {
            yi0Var.onDetachedFromWindow();
            this.f24434c = null;
        }
        this.f24433b = xi0Var;
        xi0Var.f32605v0 = this;
        if (this.d) {
            xi0Var.I(1);
        }
        HashMap hashMap = this.f24432a;
        if (hashMap != null) {
            this.f24433b.f32578a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                xi0 xi0Var2 = this.f24433b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                xi0Var2.f32601s.put((String) entry.getKey(), num);
                xi0Var2.E();
            }
            this.f24433b.m();
        }
        this.f24433b.H(true);
        setImageDrawable(this.f24433b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f24433b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        yi0 yi0Var = this.f24434c;
        if (yi0Var != null) {
            yi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null) {
            xi0Var.f32604u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f24437n = z10;
    }

    public void setProgress(float f7) {
        xi0 xi0Var = this.f24433b;
        if (xi0Var != null) {
            xi0Var.Q(f7, true);
        }
    }

    public void c() {
    }
}
