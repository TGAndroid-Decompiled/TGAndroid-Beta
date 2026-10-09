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
public class fk0 extends ImageView {
    public HashMap f26397a;
    public ck0 f26398b;
    public dk0 f26399c;
    public boolean d;
    public boolean f26400e;
    public boolean f26401f;
    public Integer h;
    public boolean f26402n;

    public fk0(Context context) {
        super(context);
    }

    public final void a() {
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null) {
            ck0Var.stop();
        }
        dk0 dk0Var = this.f26399c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
            this.f26399c = null;
        }
        this.f26398b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null && ck0Var.f25409k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null || this.f26399c != null) {
            this.f26401f = true;
            if (this.f26400e) {
                if (ck0Var != null) {
                    ck0Var.start();
                }
                dk0 dk0Var = this.f26399c;
                if (dk0Var != null) {
                    dk0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ck0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        dk0 dk0Var = this.f26399c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
            this.f26399c = null;
        }
        if (document != null) {
            dk0 dk0Var2 = new dk0(this);
            this.f26399c = dk0Var2;
            dk0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f26402n) {
                this.f26399c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                dk0 dk0Var3 = this.f26399c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                dk0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20962m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f26399c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f26399c.setAspectFit(true);
            this.f26399c.setParentView(this);
            if (this.d) {
                this.f26399c.setAutoRepeat(1);
                this.f26399c.setAllowStartLottieAnimation(true);
                this.f26399c.setAllowStartAnimation(true);
            } else {
                this.f26399c.setAutoRepeat(0);
            }
            dk0 dk0Var4 = this.f26399c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            dk0Var4.setLayerNum(i12);
            this.f26399c.clip = false;
            setImageDrawable(new ek0(this, i10, i11));
            if (this.f26400e) {
                this.f26399c.onAttachedToWindow();
            }
        }
    }

    public ck0 getAnimatedDrawable() {
        return this.f26398b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26399c;
    }

    public final void h(int i10, String str) {
        if (this.f26397a == null) {
            this.f26397a = new HashMap();
        }
        this.f26397a.put(str, Integer.valueOf(i10));
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null) {
            ck0Var.Q(i10, str);
        }
    }

    public final void i() {
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null || this.f26399c != null) {
            this.f26401f = false;
            if (this.f26400e) {
                if (ck0Var != null) {
                    ck0Var.stop();
                }
                dk0 dk0Var = this.f26399c;
                if (dk0Var != null) {
                    dk0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26400e = true;
        dk0 dk0Var = this.f26399c;
        if (dk0Var != null) {
            dk0Var.onAttachedToWindow();
            if (this.f26401f) {
                this.f26399c.startAnimation();
            }
        }
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null) {
            ck0Var.setCallback(this);
            if (this.f26401f) {
                this.f26398b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26400e = false;
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null) {
            ck0Var.stop();
        }
        dk0 dk0Var = this.f26399c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(ck0 ck0Var) {
        if (this.f26398b == ck0Var) {
            return;
        }
        dk0 dk0Var = this.f26399c;
        if (dk0Var != null) {
            dk0Var.onDetachedFromWindow();
            this.f26399c = null;
        }
        this.f26398b = ck0Var;
        ck0Var.R(this);
        if (this.d) {
            this.f26398b.K(1);
        }
        HashMap hashMap = this.f26397a;
        if (hashMap != null) {
            this.f26398b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ck0 ck0Var2 = this.f26398b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ck0Var2.f25418s.put((String) entry.getKey(), num);
                ck0Var2.G();
            }
            this.f26398b.o();
        }
        this.f26398b.J(true);
        setImageDrawable(this.f26398b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26398b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        dk0 dk0Var = this.f26399c;
        if (dk0Var != null) {
            dk0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null) {
            ck0Var.f25420t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26402n = z10;
    }

    public void setProgress(float f7) {
        ck0 ck0Var = this.f26398b;
        if (ck0Var != null) {
            ck0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
