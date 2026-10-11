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
public class hk0 extends ImageView {
    public HashMap f27019a;
    public ek0 f27020b;
    public fk0 f27021c;
    public boolean d;
    public boolean f27022e;
    public boolean f27023f;
    public Integer h;
    public boolean f27024n;

    public hk0(Context context) {
        super(context);
    }

    public final void a() {
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null) {
            ek0Var.stop();
        }
        fk0 fk0Var = this.f27021c;
        if (fk0Var != null) {
            fk0Var.onDetachedFromWindow();
            this.f27021c = null;
        }
        this.f27020b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null && ek0Var.f26051k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null || this.f27021c != null) {
            this.f27023f = true;
            if (this.f27022e) {
                if (ek0Var != null) {
                    ek0Var.start();
                }
                fk0 fk0Var = this.f27021c;
                if (fk0Var != null) {
                    fk0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ek0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        fk0 fk0Var = this.f27021c;
        if (fk0Var != null) {
            fk0Var.onDetachedFromWindow();
            this.f27021c = null;
        }
        if (document != null) {
            fk0 fk0Var2 = new fk0(this);
            this.f27021c = fk0Var2;
            fk0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = a1.g.l(i10, i11, "_");
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f27024n) {
                this.f27021c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                fk0 fk0Var3 = this.f27021c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                fk0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f20951m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f27021c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f27021c.setAspectFit(true);
            this.f27021c.setParentView(this);
            if (this.d) {
                this.f27021c.setAutoRepeat(1);
                this.f27021c.setAllowStartLottieAnimation(true);
                this.f27021c.setAllowStartAnimation(true);
            } else {
                this.f27021c.setAutoRepeat(0);
            }
            fk0 fk0Var4 = this.f27021c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            fk0Var4.setLayerNum(i12);
            this.f27021c.clip = false;
            setImageDrawable(new gk0(this, i10, i11));
            if (this.f27022e) {
                this.f27021c.onAttachedToWindow();
            }
        }
    }

    public ek0 getAnimatedDrawable() {
        return this.f27020b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f27021c;
    }

    public final void h(int i10, String str) {
        if (this.f27019a == null) {
            this.f27019a = new HashMap();
        }
        this.f27019a.put(str, Integer.valueOf(i10));
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null) {
            ek0Var.Q(i10, str);
        }
    }

    public final void i() {
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null || this.f27021c != null) {
            this.f27023f = false;
            if (this.f27022e) {
                if (ek0Var != null) {
                    ek0Var.stop();
                }
                fk0 fk0Var = this.f27021c;
                if (fk0Var != null) {
                    fk0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27022e = true;
        fk0 fk0Var = this.f27021c;
        if (fk0Var != null) {
            fk0Var.onAttachedToWindow();
            if (this.f27023f) {
                this.f27021c.startAnimation();
            }
        }
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null) {
            ek0Var.setCallback(this);
            if (this.f27023f) {
                this.f27020b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27022e = false;
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null) {
            ek0Var.stop();
        }
        fk0 fk0Var = this.f27021c;
        if (fk0Var != null) {
            fk0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(ek0 ek0Var) {
        if (this.f27020b == ek0Var) {
            return;
        }
        fk0 fk0Var = this.f27021c;
        if (fk0Var != null) {
            fk0Var.onDetachedFromWindow();
            this.f27021c = null;
        }
        this.f27020b = ek0Var;
        ek0Var.R(this);
        if (this.d) {
            this.f27020b.K(1);
        }
        HashMap hashMap = this.f27019a;
        if (hashMap != null) {
            this.f27020b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ek0 ek0Var2 = this.f27020b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ek0Var2.f26060s.put((String) entry.getKey(), num);
                ek0Var2.G();
            }
            this.f27020b.o();
        }
        this.f27020b.J(true);
        setImageDrawable(this.f27020b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f27020b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        fk0 fk0Var = this.f27021c;
        if (fk0Var != null) {
            fk0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null) {
            ek0Var.f26062t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f27024n = z10;
    }

    public void setProgress(float f7) {
        ek0 ek0Var = this.f27020b;
        if (ek0Var != null) {
            ek0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
