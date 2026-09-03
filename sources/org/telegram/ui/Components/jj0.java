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
public class jj0 extends ImageView {
    public HashMap f25969a;
    public gj0 f25970b;
    public hj0 f25971c;
    public boolean d;
    public boolean e;
    public boolean f25972f;
    public Integer h;
    public boolean f25973n;

    public jj0(Context context) {
        super(context);
    }

    public final void a() {
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null) {
            gj0Var.stop();
        }
        hj0 hj0Var = this.f25971c;
        if (hj0Var != null) {
            hj0Var.onDetachedFromWindow();
            this.f25971c = null;
        }
        this.f25970b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null && gj0Var.f25164i0) {
            return true;
        }
        return false;
    }

    public final void d() {
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null || this.f25971c != null) {
            this.f25972f = true;
            if (this.e) {
                if (gj0Var != null) {
                    gj0Var.start();
                }
                hj0 hj0Var = this.f25971c;
                if (hj0Var != null) {
                    hj0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new gj0(i10, AndroidUtilities.dp(i11), AndroidUtilities.dp(i12), false, iArr));
    }

    public final void g(int i10, int i11, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i12;
        hj0 hj0Var = this.f25971c;
        if (hj0Var != null) {
            hj0Var.onDetachedFromWindow();
            this.f25971c = null;
        }
        if (document != null) {
            hj0 hj0Var2 = new hj0(this);
            this.f25971c = hj0Var2;
            hj0Var2.setAllowLoadingOnAttachedOnly(true);
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
            if (this.f25973n) {
                this.f25971c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                hj0 hj0Var3 = this.f25971c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i10 + "_" + i11 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                hj0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f25971c.setImage(ImageLocation.getForDocument(document), i10 + "_" + i11 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.h(i10, "_", i11), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f25971c.setAspectFit(true);
            this.f25971c.setParentView(this);
            if (this.d) {
                this.f25971c.setAutoRepeat(1);
                this.f25971c.setAllowStartLottieAnimation(true);
                this.f25971c.setAllowStartAnimation(true);
            } else {
                this.f25971c.setAutoRepeat(0);
            }
            hj0 hj0Var4 = this.f25971c;
            Integer num = this.h;
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = 7;
            }
            hj0Var4.setLayerNum(i12);
            this.f25971c.clip = false;
            setImageDrawable(new ij0(this, i10, i11));
            if (this.e) {
                this.f25971c.onAttachedToWindow();
            }
        }
    }

    public gj0 getAnimatedDrawable() {
        return this.f25970b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f25971c;
    }

    public final void h(int i10, String str) {
        if (this.f25969a == null) {
            this.f25969a = new HashMap();
        }
        this.f25969a.put(str, Integer.valueOf(i10));
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null) {
            gj0Var.O(i10, str);
        }
    }

    public final void i() {
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null || this.f25971c != null) {
            this.f25972f = false;
            if (this.e) {
                if (gj0Var != null) {
                    gj0Var.stop();
                }
                hj0 hj0Var = this.f25971c;
                if (hj0Var != null) {
                    hj0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        hj0 hj0Var = this.f25971c;
        if (hj0Var != null) {
            hj0Var.onAttachedToWindow();
            if (this.f25972f) {
                this.f25971c.startAnimation();
            }
        }
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null) {
            gj0Var.setCallback(this);
            if (this.f25972f) {
                this.f25970b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null) {
            gj0Var.stop();
        }
        hj0 hj0Var = this.f25971c;
        if (hj0Var != null) {
            hj0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(gj0 gj0Var) {
        if (this.f25970b == gj0Var) {
            return;
        }
        hj0 hj0Var = this.f25971c;
        if (hj0Var != null) {
            hj0Var.onDetachedFromWindow();
            this.f25971c = null;
        }
        this.f25970b = gj0Var;
        gj0Var.f25176s0 = this;
        if (this.d) {
            gj0Var.I(1);
        }
        HashMap hashMap = this.f25969a;
        if (hashMap != null) {
            this.f25970b.X = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                gj0 gj0Var2 = this.f25970b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                gj0Var2.f25175s.put((String) entry.getKey(), num);
                gj0Var2.E();
            }
            this.f25970b.m();
        }
        this.f25970b.H(true);
        setImageDrawable(this.f25970b);
    }

    public void setAutoRepeat(boolean z4) {
        this.d = z4;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f25970b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        hj0 hj0Var = this.f25971c;
        if (hj0Var != null) {
            hj0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null) {
            gj0Var.f25174r0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z4) {
        this.f25973n = z4;
    }

    public void setProgress(float f10) {
        gj0 gj0Var = this.f25970b;
        if (gj0Var != null) {
            gj0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
