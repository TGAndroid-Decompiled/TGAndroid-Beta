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
    public HashMap f28753a;
    public ij0 f28754b;
    public jj0 f28755c;
    public boolean d;
    public boolean f28756e;
    public boolean f28757f;
    public Integer h;
    public boolean f28758n;

    public lj0(Context context) {
        super(context);
    }

    public final void a() {
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null) {
            ij0Var.stop();
        }
        jj0 jj0Var = this.f28755c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.f28755c = null;
        }
        this.f28754b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null && ij0Var.f27823i0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null || this.f28755c != null) {
            this.f28757f = true;
            if (this.f28756e) {
                if (ij0Var != null) {
                    ij0Var.start();
                }
                jj0 jj0Var = this.f28755c;
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
        setAnimation(new ij0(i10, l.d.j(i10, ""), AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        jj0 jj0Var = this.f28755c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.f28755c = null;
        }
        if (document != null) {
            jj0 jj0Var2 = new jj0(this);
            this.f28755c = jj0Var2;
            jj0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = e2.c.h(i10, "_", i11);
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f28758n) {
                this.f28755c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                jj0 jj0Var3 = this.f28755c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                jj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21821m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f28755c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f28755c.setAspectFit(true);
            this.f28755c.setParentView(this);
            if (this.d) {
                this.f28755c.setAutoRepeat(1);
                this.f28755c.setAllowStartLottieAnimation(true);
                this.f28755c.setAllowStartAnimation(true);
            } else {
                this.f28755c.setAutoRepeat(0);
            }
            jj0 jj0Var4 = this.f28755c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            jj0Var4.setLayerNum(i12);
            this.f28755c.clip = false;
            setImageDrawable(new kj0(this, i10, i11));
            if (this.f28756e) {
                this.f28755c.onAttachedToWindow();
            }
        }
    }

    public ij0 getAnimatedDrawable() {
        return this.f28754b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f28755c;
    }

    public final void h(int i10, String str) {
        if (this.f28753a == null) {
            this.f28753a = new HashMap();
        }
        this.f28753a.put(str, Integer.valueOf(i10));
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null) {
            ij0Var.O(i10, str);
        }
    }

    public final void i() {
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null || this.f28755c != null) {
            this.f28757f = false;
            if (this.f28756e) {
                if (ij0Var != null) {
                    ij0Var.stop();
                }
                jj0 jj0Var = this.f28755c;
                if (jj0Var != null) {
                    jj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28756e = true;
        jj0 jj0Var = this.f28755c;
        if (jj0Var != null) {
            jj0Var.onAttachedToWindow();
            if (this.f28757f) {
                this.f28755c.startAnimation();
            }
        }
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null) {
            ij0Var.setCallback(this);
            if (this.f28757f) {
                this.f28754b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28756e = false;
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null) {
            ij0Var.stop();
        }
        jj0 jj0Var = this.f28755c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(ij0 ij0Var) {
        if (this.f28754b == ij0Var) {
            return;
        }
        jj0 jj0Var = this.f28755c;
        if (jj0Var != null) {
            jj0Var.onDetachedFromWindow();
            this.f28755c = null;
        }
        this.f28754b = ij0Var;
        ij0Var.f27835s0 = this;
        if (this.d) {
            ij0Var.I(1);
        }
        HashMap hashMap = this.f28753a;
        if (hashMap != null) {
            this.f28754b.X = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ij0 ij0Var2 = this.f28754b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ij0Var2.f27834s.put((String) entry.getKey(), num);
                ij0Var2.E();
            }
            this.f28754b.m();
        }
        this.f28754b.H(true);
        setImageDrawable(this.f28754b);
    }

    public void setAutoRepeat(boolean z4) {
        this.d = z4;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f28754b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        jj0 jj0Var = this.f28755c;
        if (jj0Var != null) {
            jj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null) {
            ij0Var.f27833r0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z4) {
        this.f28758n = z4;
    }

    public void setProgress(float f10) {
        ij0 ij0Var = this.f28754b;
        if (ij0Var != null) {
            ij0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
