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
public class oj0 extends ImageView {
    public HashMap f27108a;
    public lj0 f27109b;
    public mj0 f27110c;
    public boolean d;
    public boolean e;
    public boolean f27111f;
    public Integer h;
    public boolean f27112n;

    public oj0(Context context) {
        super(context);
    }

    public final void a() {
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null) {
            lj0Var.stop();
        }
        mj0 mj0Var = this.f27110c;
        if (mj0Var != null) {
            mj0Var.onDetachedFromWindow();
            this.f27110c = null;
        }
        this.f27109b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null && lj0Var.f26021k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null || this.f27110c != null) {
            this.f27111f = true;
            if (this.e) {
                if (lj0Var != null) {
                    lj0Var.start();
                }
                mj0 mj0Var = this.f27110c;
                if (mj0Var != null) {
                    mj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new lj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        mj0 mj0Var = this.f27110c;
        if (mj0Var != null) {
            mj0Var.onDetachedFromWindow();
            this.f27110c = null;
        }
        if (document != null) {
            mj0 mj0Var2 = new mj0(this);
            this.f27110c = mj0Var2;
            mj0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = a4.a.l(i10, i11, "_");
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f27112n) {
                this.f27110c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                mj0 mj0Var3 = this.f27110c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                mj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f19240m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f27110c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i11, "_"), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f27110c.setAspectFit(true);
            this.f27110c.setParentView(this);
            if (this.d) {
                this.f27110c.setAutoRepeat(1);
                this.f27110c.setAllowStartLottieAnimation(true);
                this.f27110c.setAllowStartAnimation(true);
            } else {
                this.f27110c.setAutoRepeat(0);
            }
            mj0 mj0Var4 = this.f27110c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            mj0Var4.setLayerNum(i12);
            this.f27110c.clip = false;
            setImageDrawable(new nj0(this, i10, i11));
            if (this.e) {
                this.f27110c.onAttachedToWindow();
            }
        }
    }

    public lj0 getAnimatedDrawable() {
        return this.f27109b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f27110c;
    }

    public final void h(int i10, String str) {
        if (this.f27108a == null) {
            this.f27108a = new HashMap();
        }
        this.f27108a.put(str, Integer.valueOf(i10));
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null) {
            lj0Var.Q(i10, str);
        }
    }

    public final void i() {
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null || this.f27110c != null) {
            this.f27111f = false;
            if (this.e) {
                if (lj0Var != null) {
                    lj0Var.stop();
                }
                mj0 mj0Var = this.f27110c;
                if (mj0Var != null) {
                    mj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        mj0 mj0Var = this.f27110c;
        if (mj0Var != null) {
            mj0Var.onAttachedToWindow();
            if (this.f27111f) {
                this.f27110c.startAnimation();
            }
        }
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null) {
            lj0Var.setCallback(this);
            if (this.f27111f) {
                this.f27109b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null) {
            lj0Var.stop();
        }
        mj0 mj0Var = this.f27110c;
        if (mj0Var != null) {
            mj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(lj0 lj0Var) {
        if (this.f27109b == lj0Var) {
            return;
        }
        mj0 mj0Var = this.f27110c;
        if (mj0Var != null) {
            mj0Var.onDetachedFromWindow();
            this.f27110c = null;
        }
        this.f27109b = lj0Var;
        lj0Var.R(this);
        if (this.d) {
            this.f27109b.K(1);
        }
        HashMap hashMap = this.f27108a;
        if (hashMap != null) {
            this.f27109b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                lj0 lj0Var2 = this.f27109b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                lj0Var2.f26030s.put((String) entry.getKey(), num);
                lj0Var2.G();
            }
            this.f27109b.o();
        }
        this.f27109b.J(true);
        setImageDrawable(this.f27109b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f27109b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        mj0 mj0Var = this.f27110c;
        if (mj0Var != null) {
            mj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null) {
            lj0Var.f26032t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f27112n = z10;
    }

    public void setProgress(float f7) {
        lj0 lj0Var = this.f27109b;
        if (lj0Var != null) {
            lj0Var.T(f7, true);
        }
    }

    public void c() {
    }
}
