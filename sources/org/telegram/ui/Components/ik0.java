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
public class ik0 extends ImageView {
    public HashMap f27180a;
    public fk0 f27181b;
    public gk0 f27182c;
    public boolean d;
    public boolean f27183e;
    public boolean f27184f;
    public Integer h;
    public boolean f27185n;

    public ik0(Context context) {
        super(context);
    }

    public final void a() {
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null) {
            fk0Var.stop();
        }
        gk0 gk0Var = this.f27182c;
        if (gk0Var != null) {
            gk0Var.onDetachedFromWindow();
            this.f27182c = null;
        }
        this.f27181b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null && fk0Var.f26117k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null || this.f27182c != null) {
            this.f27184f = true;
            if (this.f27183e) {
                if (fk0Var != null) {
                    fk0Var.start();
                }
                gk0 gk0Var = this.f27182c;
                if (gk0Var != null) {
                    gk0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new fk0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        gk0 gk0Var = this.f27182c;
        if (gk0Var != null) {
            gk0Var.onDetachedFromWindow();
            this.f27182c = null;
        }
        if (document != null) {
            gk0 gk0Var2 = new gk0(this);
            this.f27182c = gk0Var2;
            gk0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f27185n) {
                this.f27182c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                gk0 gk0Var3 = this.f27182c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                gk0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f20725m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f27182c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f27182c.setAspectFit(true);
            this.f27182c.setParentView(this);
            if (this.d) {
                this.f27182c.setAutoRepeat(1);
                this.f27182c.setAllowStartLottieAnimation(true);
                this.f27182c.setAllowStartAnimation(true);
            } else {
                this.f27182c.setAutoRepeat(0);
            }
            gk0 gk0Var4 = this.f27182c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            gk0Var4.setLayerNum(i12);
            this.f27182c.clip = false;
            setImageDrawable(new hk0(this, i10, i11));
            if (this.f27183e) {
                this.f27182c.onAttachedToWindow();
            }
        }
    }

    public fk0 getAnimatedDrawable() {
        return this.f27181b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f27182c;
    }

    public final void h(int i10, String str) {
        if (this.f27180a == null) {
            this.f27180a = new HashMap();
        }
        this.f27180a.put(str, Integer.valueOf(i10));
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null) {
            fk0Var.Q(i10, str);
        }
    }

    public final void i() {
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null || this.f27182c != null) {
            this.f27184f = false;
            if (this.f27183e) {
                if (fk0Var != null) {
                    fk0Var.stop();
                }
                gk0 gk0Var = this.f27182c;
                if (gk0Var != null) {
                    gk0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27183e = true;
        gk0 gk0Var = this.f27182c;
        if (gk0Var != null) {
            gk0Var.onAttachedToWindow();
            if (this.f27184f) {
                this.f27182c.startAnimation();
            }
        }
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null) {
            fk0Var.setCallback(this);
            if (this.f27184f) {
                this.f27181b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27183e = false;
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null) {
            fk0Var.stop();
        }
        gk0 gk0Var = this.f27182c;
        if (gk0Var != null) {
            gk0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(fk0 fk0Var) {
        if (this.f27181b == fk0Var) {
            return;
        }
        gk0 gk0Var = this.f27182c;
        if (gk0Var != null) {
            gk0Var.onDetachedFromWindow();
            this.f27182c = null;
        }
        this.f27181b = fk0Var;
        fk0Var.R(this);
        if (this.d) {
            this.f27181b.K(1);
        }
        HashMap hashMap = this.f27180a;
        if (hashMap != null) {
            this.f27181b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                fk0 fk0Var2 = this.f27181b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                fk0Var2.f26126s.put((String) entry.getKey(), num);
                fk0Var2.G();
            }
            this.f27181b.o();
        }
        this.f27181b.J(true);
        setImageDrawable(this.f27181b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f27181b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        gk0 gk0Var = this.f27182c;
        if (gk0Var != null) {
            gk0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null) {
            fk0Var.f26128t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f27185n = z10;
    }

    public void setProgress(float f7) {
        fk0 fk0Var = this.f27181b;
        if (fk0Var != null) {
            fk0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
