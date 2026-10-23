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
public class bk0 extends ImageView {
    public HashMap f25090a;
    public yj0 f25091b;
    public zj0 f25092c;
    public boolean d;
    public boolean e;
    public boolean f25093f;
    public Integer h;
    public boolean f25094n;

    public bk0(Context context) {
        super(context);
    }

    public final void a() {
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null) {
            yj0Var.stop();
        }
        zj0 zj0Var = this.f25092c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
            this.f25092c = null;
        }
        this.f25091b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null && yj0Var.f32946k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null || this.f25092c != null) {
            this.f25093f = true;
            if (this.e) {
                if (yj0Var != null) {
                    yj0Var.start();
                }
                zj0 zj0Var = this.f25092c;
                if (zj0Var != null) {
                    zj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new yj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        zj0 zj0Var = this.f25092c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
            this.f25092c = null;
        }
        if (document != null) {
            zj0 zj0Var2 = new zj0(this);
            this.f25092c = zj0Var2;
            zj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f25094n) {
                this.f25092c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                zj0 zj0Var3 = this.f25092c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                zj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21346m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f25092c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f25092c.setAspectFit(true);
            this.f25092c.setParentView(this);
            if (this.d) {
                this.f25092c.setAutoRepeat(1);
                this.f25092c.setAllowStartLottieAnimation(true);
                this.f25092c.setAllowStartAnimation(true);
            } else {
                this.f25092c.setAutoRepeat(0);
            }
            zj0 zj0Var4 = this.f25092c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            zj0Var4.setLayerNum(i12);
            this.f25092c.clip = false;
            setImageDrawable(new ak0(this, i10, i11));
            if (this.e) {
                this.f25092c.onAttachedToWindow();
            }
        }
    }

    public yj0 getAnimatedDrawable() {
        return this.f25091b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f25092c;
    }

    public final void h(int i10, String str) {
        if (this.f25090a == null) {
            this.f25090a = new HashMap();
        }
        this.f25090a.put(str, Integer.valueOf(i10));
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null) {
            yj0Var.Q(i10, str);
        }
    }

    public final void i() {
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null || this.f25092c != null) {
            this.f25093f = false;
            if (this.e) {
                if (yj0Var != null) {
                    yj0Var.stop();
                }
                zj0 zj0Var = this.f25092c;
                if (zj0Var != null) {
                    zj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        zj0 zj0Var = this.f25092c;
        if (zj0Var != null) {
            zj0Var.onAttachedToWindow();
            if (this.f25093f) {
                this.f25092c.startAnimation();
            }
        }
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null) {
            yj0Var.setCallback(this);
            if (this.f25093f) {
                this.f25091b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null) {
            yj0Var.stop();
        }
        zj0 zj0Var = this.f25092c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(yj0 yj0Var) {
        if (this.f25091b == yj0Var) {
            return;
        }
        zj0 zj0Var = this.f25092c;
        if (zj0Var != null) {
            zj0Var.onDetachedFromWindow();
            this.f25092c = null;
        }
        this.f25091b = yj0Var;
        yj0Var.R(this);
        if (this.d) {
            this.f25091b.K(1);
        }
        HashMap hashMap = this.f25090a;
        if (hashMap != null) {
            this.f25091b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                yj0 yj0Var2 = this.f25091b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                yj0Var2.f32955s.put((String) entry.getKey(), num);
                yj0Var2.G();
            }
            this.f25091b.o();
        }
        this.f25091b.J(true);
        setImageDrawable(this.f25091b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f25091b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        zj0 zj0Var = this.f25092c;
        if (zj0Var != null) {
            zj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null) {
            yj0Var.f32957t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f25094n = z10;
    }

    public void setProgress(float f7) {
        yj0 yj0Var = this.f25091b;
        if (yj0Var != null) {
            yj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
