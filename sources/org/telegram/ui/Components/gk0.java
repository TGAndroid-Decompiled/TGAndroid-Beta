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
public class gk0 extends ImageView {
    public HashMap f26751a;
    public dk0 f26752b;
    public ek0 f26753c;
    public boolean d;
    public boolean f26754e;
    public boolean f26755f;
    public Integer h;
    public boolean f26756n;

    public gk0(Context context) {
        super(context);
    }

    public final void a() {
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null) {
            dk0Var.stop();
        }
        ek0 ek0Var = this.f26753c;
        if (ek0Var != null) {
            ek0Var.onDetachedFromWindow();
            this.f26753c = null;
        }
        this.f26752b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null && dk0Var.f25740k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null || this.f26753c != null) {
            this.f26755f = true;
            if (this.f26754e) {
                if (dk0Var != null) {
                    dk0Var.start();
                }
                ek0 ek0Var = this.f26753c;
                if (ek0Var != null) {
                    ek0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new dk0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        ek0 ek0Var = this.f26753c;
        if (ek0Var != null) {
            ek0Var.onDetachedFromWindow();
            this.f26753c = null;
        }
        if (document != null) {
            ek0 ek0Var2 = new ek0(this);
            this.f26753c = ek0Var2;
            ek0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f26756n) {
                this.f26753c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                ek0 ek0Var3 = this.f26753c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                ek0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20966m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f26753c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f26753c.setAspectFit(true);
            this.f26753c.setParentView(this);
            if (this.d) {
                this.f26753c.setAutoRepeat(1);
                this.f26753c.setAllowStartLottieAnimation(true);
                this.f26753c.setAllowStartAnimation(true);
            } else {
                this.f26753c.setAutoRepeat(0);
            }
            ek0 ek0Var4 = this.f26753c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            ek0Var4.setLayerNum(i12);
            this.f26753c.clip = false;
            setImageDrawable(new fk0(this, i10, i11));
            if (this.f26754e) {
                this.f26753c.onAttachedToWindow();
            }
        }
    }

    public dk0 getAnimatedDrawable() {
        return this.f26752b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26753c;
    }

    public final void h(int i10, String str) {
        if (this.f26751a == null) {
            this.f26751a = new HashMap();
        }
        this.f26751a.put(str, Integer.valueOf(i10));
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null) {
            dk0Var.Q(i10, str);
        }
    }

    public final void i() {
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null || this.f26753c != null) {
            this.f26755f = false;
            if (this.f26754e) {
                if (dk0Var != null) {
                    dk0Var.stop();
                }
                ek0 ek0Var = this.f26753c;
                if (ek0Var != null) {
                    ek0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26754e = true;
        ek0 ek0Var = this.f26753c;
        if (ek0Var != null) {
            ek0Var.onAttachedToWindow();
            if (this.f26755f) {
                this.f26753c.startAnimation();
            }
        }
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null) {
            dk0Var.setCallback(this);
            if (this.f26755f) {
                this.f26752b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26754e = false;
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null) {
            dk0Var.stop();
        }
        ek0 ek0Var = this.f26753c;
        if (ek0Var != null) {
            ek0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(dk0 dk0Var) {
        if (this.f26752b == dk0Var) {
            return;
        }
        ek0 ek0Var = this.f26753c;
        if (ek0Var != null) {
            ek0Var.onDetachedFromWindow();
            this.f26753c = null;
        }
        this.f26752b = dk0Var;
        dk0Var.R(this);
        if (this.d) {
            this.f26752b.K(1);
        }
        HashMap hashMap = this.f26751a;
        if (hashMap != null) {
            this.f26752b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                dk0 dk0Var2 = this.f26752b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                dk0Var2.f25749s.put((String) entry.getKey(), num);
                dk0Var2.G();
            }
            this.f26752b.o();
        }
        this.f26752b.J(true);
        setImageDrawable(this.f26752b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26752b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ek0 ek0Var = this.f26753c;
        if (ek0Var != null) {
            ek0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null) {
            dk0Var.f25751t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26756n = z10;
    }

    public void setProgress(float f7) {
        dk0 dk0Var = this.f26752b;
        if (dk0Var != null) {
            dk0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
