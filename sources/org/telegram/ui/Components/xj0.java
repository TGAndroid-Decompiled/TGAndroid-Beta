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
public class xj0 extends ImageView {
    public HashMap f32409a;
    public uj0 f32410b;
    public vj0 f32411c;
    public boolean d;
    public boolean e;
    public boolean f32412f;
    public Integer h;
    public boolean f32413n;

    public xj0(Context context) {
        super(context);
    }

    public final void a() {
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null) {
            uj0Var.stop();
        }
        vj0 vj0Var = this.f32411c;
        if (vj0Var != null) {
            vj0Var.onDetachedFromWindow();
            this.f32411c = null;
        }
        this.f32410b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null && uj0Var.f30987k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null || this.f32411c != null) {
            this.f32412f = true;
            if (this.e) {
                if (uj0Var != null) {
                    uj0Var.start();
                }
                vj0 vj0Var = this.f32411c;
                if (vj0Var != null) {
                    vj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new uj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        vj0 vj0Var = this.f32411c;
        if (vj0Var != null) {
            vj0Var.onDetachedFromWindow();
            this.f32411c = null;
        }
        if (document != null) {
            vj0 vj0Var2 = new vj0(this);
            this.f32411c = vj0Var2;
            vj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f32413n) {
                this.f32411c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                vj0 vj0Var3 = this.f32411c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                vj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21150m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f32411c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.k(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f32411c.setAspectFit(true);
            this.f32411c.setParentView(this);
            if (this.d) {
                this.f32411c.setAutoRepeat(1);
                this.f32411c.setAllowStartLottieAnimation(true);
                this.f32411c.setAllowStartAnimation(true);
            } else {
                this.f32411c.setAutoRepeat(0);
            }
            vj0 vj0Var4 = this.f32411c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            vj0Var4.setLayerNum(i12);
            this.f32411c.clip = false;
            setImageDrawable(new wj0(this, i10, i11));
            if (this.e) {
                this.f32411c.onAttachedToWindow();
            }
        }
    }

    public uj0 getAnimatedDrawable() {
        return this.f32410b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32411c;
    }

    public final void h(int i10, String str) {
        if (this.f32409a == null) {
            this.f32409a = new HashMap();
        }
        this.f32409a.put(str, Integer.valueOf(i10));
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null) {
            uj0Var.Q(i10, str);
        }
    }

    public final void i() {
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null || this.f32411c != null) {
            this.f32412f = false;
            if (this.e) {
                if (uj0Var != null) {
                    uj0Var.stop();
                }
                vj0 vj0Var = this.f32411c;
                if (vj0Var != null) {
                    vj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        vj0 vj0Var = this.f32411c;
        if (vj0Var != null) {
            vj0Var.onAttachedToWindow();
            if (this.f32412f) {
                this.f32411c.startAnimation();
            }
        }
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null) {
            uj0Var.setCallback(this);
            if (this.f32412f) {
                this.f32410b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null) {
            uj0Var.stop();
        }
        vj0 vj0Var = this.f32411c;
        if (vj0Var != null) {
            vj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(uj0 uj0Var) {
        if (this.f32410b == uj0Var) {
            return;
        }
        vj0 vj0Var = this.f32411c;
        if (vj0Var != null) {
            vj0Var.onDetachedFromWindow();
            this.f32411c = null;
        }
        this.f32410b = uj0Var;
        uj0Var.R(this);
        if (this.d) {
            this.f32410b.K(1);
        }
        HashMap hashMap = this.f32409a;
        if (hashMap != null) {
            this.f32410b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                uj0 uj0Var2 = this.f32410b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                uj0Var2.f30996s.put((String) entry.getKey(), num);
                uj0Var2.G();
            }
            this.f32410b.o();
        }
        this.f32410b.J(true);
        setImageDrawable(this.f32410b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f32410b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        vj0 vj0Var = this.f32411c;
        if (vj0Var != null) {
            vj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null) {
            uj0Var.f30998t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f32413n = z10;
    }

    public void setProgress(float f7) {
        uj0 uj0Var = this.f32410b;
        if (uj0Var != null) {
            uj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
