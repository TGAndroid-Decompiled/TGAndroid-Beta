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
public class kj0 extends ImageView {
    public HashMap f24738a;
    public hj0 f24739b;
    public ij0 f24740c;
    public boolean d;
    public boolean e;
    public boolean f24741f;
    public Integer h;
    public boolean f24742n;

    public kj0(Context context) {
        super(context);
    }

    public final void a() {
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null) {
            hj0Var.stop();
        }
        ij0 ij0Var = this.f24740c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.f24740c = null;
        }
        this.f24739b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null && hj0Var.f23660l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null || this.f24740c != null) {
            this.f24741f = true;
            if (this.e) {
                if (hj0Var != null) {
                    hj0Var.start();
                }
                ij0 ij0Var = this.f24740c;
                if (ij0Var != null) {
                    ij0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new hj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        ij0 ij0Var = this.f24740c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.f24740c = null;
        }
        if (document != null) {
            ij0 ij0Var2 = new ij0(this);
            this.f24740c = ij0Var2;
            ij0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f24742n) {
                this.f24740c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                ij0 ij0Var3 = this.f24740c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                ij0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f24740c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f24740c.setAspectFit(true);
            this.f24740c.setParentView(this);
            if (this.d) {
                this.f24740c.setAutoRepeat(1);
                this.f24740c.setAllowStartLottieAnimation(true);
                this.f24740c.setAllowStartAnimation(true);
            } else {
                this.f24740c.setAutoRepeat(0);
            }
            ij0 ij0Var4 = this.f24740c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            ij0Var4.setLayerNum(i12);
            this.f24740c.clip = false;
            setImageDrawable(new jj0(this, i10, i11));
            if (this.e) {
                this.f24740c.onAttachedToWindow();
            }
        }
    }

    public hj0 getAnimatedDrawable() {
        return this.f24739b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f24740c;
    }

    public final void h(int i10, String str) {
        if (this.f24738a == null) {
            this.f24738a = new HashMap();
        }
        this.f24738a.put(str, Integer.valueOf(i10));
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null) {
            hj0Var.Q(i10, str);
        }
    }

    public final void i() {
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null || this.f24740c != null) {
            this.f24741f = false;
            if (this.e) {
                if (hj0Var != null) {
                    hj0Var.stop();
                }
                ij0 ij0Var = this.f24740c;
                if (ij0Var != null) {
                    ij0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        ij0 ij0Var = this.f24740c;
        if (ij0Var != null) {
            ij0Var.onAttachedToWindow();
            if (this.f24741f) {
                this.f24740c.startAnimation();
            }
        }
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null) {
            hj0Var.setCallback(this);
            if (this.f24741f) {
                this.f24739b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null) {
            hj0Var.stop();
        }
        ij0 ij0Var = this.f24740c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(hj0 hj0Var) {
        if (this.f24739b == hj0Var) {
            return;
        }
        ij0 ij0Var = this.f24740c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.f24740c = null;
        }
        this.f24739b = hj0Var;
        hj0Var.f23672v0 = this;
        if (this.d) {
            hj0Var.K(1);
        }
        HashMap hashMap = this.f24738a;
        if (hashMap != null) {
            this.f24739b.f23646a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                hj0 hj0Var2 = this.f24739b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                hj0Var2.f23668s.put((String) entry.getKey(), num);
                hj0Var2.G();
            }
            this.f24739b.o();
        }
        this.f24739b.J(true);
        setImageDrawable(this.f24739b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f24739b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ij0 ij0Var = this.f24740c;
        if (ij0Var != null) {
            ij0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null) {
            hj0Var.f23671u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f24742n = z10;
    }

    public void setProgress(float f7) {
        hj0 hj0Var = this.f24739b;
        if (hj0Var != null) {
            hj0Var.S(f7, true);
        }
    }

    public void c() {
    }
}
