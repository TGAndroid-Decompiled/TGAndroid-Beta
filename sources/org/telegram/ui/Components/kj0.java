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
    public HashMap f28424a;
    public hj0 f28425b;
    public ij0 f28426c;
    public boolean d;
    public boolean f28427e;
    public boolean f28428f;
    public Integer h;
    public boolean f28429n;

    public kj0(Context context) {
        super(context);
    }

    public final void a() {
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null) {
            hj0Var.stop();
        }
        ij0 ij0Var = this.f28426c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.f28426c = null;
        }
        this.f28425b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null && hj0Var.f27530i0) {
            return true;
        }
        return false;
    }

    public final void d() {
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null || this.f28426c != null) {
            this.f28428f = true;
            if (this.f28427e) {
                if (hj0Var != null) {
                    hj0Var.start();
                }
                ij0 ij0Var = this.f28426c;
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
        ij0 ij0Var = this.f28426c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.f28426c = null;
        }
        if (document != null) {
            ij0 ij0Var2 = new ij0(this);
            this.f28426c = ij0Var2;
            ij0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f28429n) {
                this.f28426c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                ij0 ij0Var3 = this.f28426c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                ij0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21823m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f28426c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f28426c.setAspectFit(true);
            this.f28426c.setParentView(this);
            if (this.d) {
                this.f28426c.setAutoRepeat(1);
                this.f28426c.setAllowStartLottieAnimation(true);
                this.f28426c.setAllowStartAnimation(true);
            } else {
                this.f28426c.setAutoRepeat(0);
            }
            ij0 ij0Var4 = this.f28426c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            ij0Var4.setLayerNum(i12);
            this.f28426c.clip = false;
            setImageDrawable(new jj0(this, i10, i11));
            if (this.f28427e) {
                this.f28426c.onAttachedToWindow();
            }
        }
    }

    public hj0 getAnimatedDrawable() {
        return this.f28425b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f28426c;
    }

    public final void h(int i10, String str) {
        if (this.f28424a == null) {
            this.f28424a = new HashMap();
        }
        this.f28424a.put(str, Integer.valueOf(i10));
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null) {
            hj0Var.O(i10, str);
        }
    }

    public final void i() {
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null || this.f28426c != null) {
            this.f28428f = false;
            if (this.f28427e) {
                if (hj0Var != null) {
                    hj0Var.stop();
                }
                ij0 ij0Var = this.f28426c;
                if (ij0Var != null) {
                    ij0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28427e = true;
        ij0 ij0Var = this.f28426c;
        if (ij0Var != null) {
            ij0Var.onAttachedToWindow();
            if (this.f28428f) {
                this.f28426c.startAnimation();
            }
        }
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null) {
            hj0Var.setCallback(this);
            if (this.f28428f) {
                this.f28425b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28427e = false;
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null) {
            hj0Var.stop();
        }
        ij0 ij0Var = this.f28426c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(hj0 hj0Var) {
        if (this.f28425b == hj0Var) {
            return;
        }
        ij0 ij0Var = this.f28426c;
        if (ij0Var != null) {
            ij0Var.onDetachedFromWindow();
            this.f28426c = null;
        }
        this.f28425b = hj0Var;
        hj0Var.f27542s0 = this;
        if (this.d) {
            hj0Var.I(1);
        }
        HashMap hashMap = this.f28424a;
        if (hashMap != null) {
            this.f28425b.X = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                hj0 hj0Var2 = this.f28425b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                hj0Var2.f27541s.put((String) entry.getKey(), num);
                hj0Var2.E();
            }
            this.f28425b.m();
        }
        this.f28425b.H(true);
        setImageDrawable(this.f28425b);
    }

    public void setAutoRepeat(boolean z4) {
        this.d = z4;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f28425b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ij0 ij0Var = this.f28426c;
        if (ij0Var != null) {
            ij0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null) {
            hj0Var.f27540r0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z4) {
        this.f28429n = z4;
    }

    public void setProgress(float f10) {
        hj0 hj0Var = this.f28425b;
        if (hj0Var != null) {
            hj0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
