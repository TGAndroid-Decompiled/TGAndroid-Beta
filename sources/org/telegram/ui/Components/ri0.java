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

public class ri0 extends ImageView {

    public HashMap f32187a;

    public oi0 f32188b;

    public pi0 f32189c;
    public boolean d;

    public boolean f32190e;

    public boolean f32191f;
    public Integer h;

    public boolean f32192n;

    public ri0(Context context) {
        super(context);
    }

    public final void a() {
        oi0 oi0Var = this.f32188b;
        if (oi0Var != null) {
            oi0Var.stop();
        }
        pi0 pi0Var = this.f32189c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
            this.f32189c = null;
        }
        this.f32188b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oi0 oi0Var = this.f32188b;
        return oi0Var != null && oi0Var.f31317h0;
    }

    public final void d() {
        oi0 oi0Var = this.f32188b;
        if (oi0Var == null && this.f32189c == null) {
            return;
        }
        this.f32191f = true;
        if (this.f32190e) {
            if (oi0Var != null) {
                oi0Var.start();
            }
            pi0 pi0Var = this.f32189c;
            if (pi0Var != null) {
                pi0Var.startAnimation();
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new oi0(i10, i0.a.k(i10, ""), AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation forDocument;
        String strL;
        pi0 pi0Var = this.f32189c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
            this.f32189c = null;
        }
        if (document == null) {
            return;
        }
        pi0 pi0Var2 = new pi0(this);
        this.f32189c = pi0Var2;
        pi0Var2.setAllowLoadingOnAttachedOnly(true);
        String str = document.localThumbPath;
        if (str != null) {
            ImageLocation forPath = ImageLocation.getForPath(str);
            strL = com.google.android.recaptcha.internal.a.l(i10, "_", i11);
            forDocument = forPath;
        } else {
            forDocument = null;
            strL = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.f32192n) {
            this.f32189c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.l(i10, "_", i11), forDocument, strL, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            pi0 pi0Var3 = this.f32189c;
            ImageLocation forDocument2 = ImageLocation.getForDocument(document);
            String str2 = i10 + "_" + i11 + "_g";
            if (forDocument == null) {
                forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            pi0Var3.setImage(forDocument2, str2, forDocument, strL, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            this.f32189c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), com.google.android.recaptcha.internal.a.l(i10, "_", i11), forDocument, strL, svgThumb, 0L, null, document, 1);
        }
        this.f32189c.setAspectFit(true);
        this.f32189c.setParentView(this);
        if (this.d) {
            this.f32189c.setAutoRepeat(1);
            this.f32189c.setAllowStartLottieAnimation(true);
            this.f32189c.setAllowStartAnimation(true);
        } else {
            this.f32189c.setAutoRepeat(0);
        }
        pi0 pi0Var4 = this.f32189c;
        Integer num = this.h;
        pi0Var4.setLayerNum(num != null ? num.intValue() : 7);
        this.f32189c.clip = false;
        setImageDrawable(new qi0(this, i10, i11));
        if (this.f32190e) {
            this.f32189c.onAttachedToWindow();
        }
    }

    public oi0 getAnimatedDrawable() {
        return this.f32188b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32189c;
    }

    public final void h(int i10, String str) {
        if (this.f32187a == null) {
            this.f32187a = new HashMap();
        }
        this.f32187a.put(str, Integer.valueOf(i10));
        oi0 oi0Var = this.f32188b;
        if (oi0Var != null) {
            oi0Var.O(i10, str);
        }
    }

    public final void i() {
        oi0 oi0Var = this.f32188b;
        if (oi0Var == null && this.f32189c == null) {
            return;
        }
        this.f32191f = false;
        if (this.f32190e) {
            if (oi0Var != null) {
                oi0Var.stop();
            }
            pi0 pi0Var = this.f32189c;
            if (pi0Var != null) {
                pi0Var.stopAnimation();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32190e = true;
        pi0 pi0Var = this.f32189c;
        if (pi0Var != null) {
            pi0Var.onAttachedToWindow();
            if (this.f32191f) {
                this.f32189c.startAnimation();
            }
        }
        oi0 oi0Var = this.f32188b;
        if (oi0Var != null) {
            oi0Var.setCallback(this);
            if (this.f32191f) {
                this.f32188b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32190e = false;
        oi0 oi0Var = this.f32188b;
        if (oi0Var != null) {
            oi0Var.stop();
        }
        pi0 pi0Var = this.f32189c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(oi0 oi0Var) {
        if (this.f32188b == oi0Var) {
            return;
        }
        pi0 pi0Var = this.f32189c;
        if (pi0Var != null) {
            pi0Var.onDetachedFromWindow();
            this.f32189c = null;
        }
        this.f32188b = oi0Var;
        oi0Var.f31328r0 = this;
        if (this.d) {
            oi0Var.I(1);
        }
        HashMap map = this.f32187a;
        if (map != null) {
            this.f32188b.W = true;
            for (Map.Entry entry : map.entrySet()) {
                oi0 oi0Var2 = this.f32188b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oi0Var2.f31329s.put(str, num);
                oi0Var2.E();
            }
            this.f32188b.m();
        }
        this.f32188b.H(true);
        setImageDrawable(this.f32188b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f32188b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        pi0 pi0Var = this.f32189c;
        if (pi0Var != null) {
            pi0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oi0 oi0Var = this.f32188b;
        if (oi0Var != null) {
            oi0Var.f31326q0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f32192n = z10;
    }

    public void setProgress(float f10) {
        oi0 oi0Var = this.f32188b;
        if (oi0Var != null) {
            oi0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
