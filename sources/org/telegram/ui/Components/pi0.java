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
public class pi0 extends ImageView {
    public HashMap f31671a;
    public mi0 f31672b;
    public ni0 f31673c;
    public boolean d;
    public boolean f31674e;
    public boolean f31675f;
    public Integer h;
    public boolean f31676n;

    public pi0(Context context) {
        super(context);
    }

    public final void a() {
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null) {
            mi0Var.stop();
        }
        ni0 ni0Var = this.f31673c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
            this.f31673c = null;
        }
        this.f31672b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null && mi0Var.f30852h0) {
            return true;
        }
        return false;
    }

    public final void d() {
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null || this.f31673c != null) {
            this.f31675f = true;
            if (this.f31674e) {
                if (mi0Var != null) {
                    mi0Var.start();
                }
                ni0 ni0Var = this.f31673c;
                if (ni0Var != null) {
                    ni0Var.startAnimation();
                }
            }
        }
    }

    public final void e(int i9, int i10, int i11) {
        f(i9, i10, i11, null);
    }

    public final void f(int i9, int i10, int i11, int[] iArr) {
        setAnimation(new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(i10), AndroidUtilities.dp(i11), false, iArr));
    }

    public final void g(int i9, int i10, TLRPC.Document document) {
        ImageLocation imageLocation;
        String str;
        int i11;
        ni0 ni0Var = this.f31673c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
            this.f31673c = null;
        }
        if (document != null) {
            ni0 ni0Var2 = new ni0(this);
            this.f31673c = ni0Var2;
            ni0Var2.setAllowLoadingOnAttachedOnly(true);
            String str2 = document.localThumbPath;
            if (str2 != null) {
                ImageLocation forPath = ImageLocation.getForPath(str2);
                str = e2.c.l(i9, "_", i10);
                imageLocation = forPath;
            } else {
                imageLocation = null;
                str = null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if (this.f31676n) {
                this.f31673c.setImage(ImageLocation.getForDocument(document), i9 + "_" + i10 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.l(i9, "_", i10), imageLocation, str, null, 0L, null, document, 1);
            } else if ("video/webm".equals(document.mime_type)) {
                ni0 ni0Var3 = this.f31673c;
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String str3 = i9 + "_" + i10 + "_g";
                if (imageLocation == null) {
                    imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                ni0Var3.setImage(forDocument, str3, imageLocation, str, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                this.f31673c.setImage(ImageLocation.getForDocument(document), i9 + "_" + i10 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), e2.c.l(i9, "_", i10), imageLocation, str, svgThumb, 0L, null, document, 1);
            }
            this.f31673c.setAspectFit(true);
            this.f31673c.setParentView(this);
            if (this.d) {
                this.f31673c.setAutoRepeat(1);
                this.f31673c.setAllowStartLottieAnimation(true);
                this.f31673c.setAllowStartAnimation(true);
            } else {
                this.f31673c.setAutoRepeat(0);
            }
            ni0 ni0Var4 = this.f31673c;
            Integer num = this.h;
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 7;
            }
            ni0Var4.setLayerNum(i11);
            this.f31673c.clip = false;
            setImageDrawable(new oi0(this, i9, i10));
            if (this.f31674e) {
                this.f31673c.onAttachedToWindow();
            }
        }
    }

    public mi0 getAnimatedDrawable() {
        return this.f31672b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f31673c;
    }

    public final void h(int i9, String str) {
        if (this.f31671a == null) {
            this.f31671a = new HashMap();
        }
        this.f31671a.put(str, Integer.valueOf(i9));
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null) {
            mi0Var.O(i9, str);
        }
    }

    public final void i() {
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null || this.f31673c != null) {
            this.f31675f = false;
            if (this.f31674e) {
                if (mi0Var != null) {
                    mi0Var.stop();
                }
                ni0 ni0Var = this.f31673c;
                if (ni0Var != null) {
                    ni0Var.stopAnimation();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31674e = true;
        ni0 ni0Var = this.f31673c;
        if (ni0Var != null) {
            ni0Var.onAttachedToWindow();
            if (this.f31675f) {
                this.f31673c.startAnimation();
            }
        }
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null) {
            mi0Var.setCallback(this);
            if (this.f31675f) {
                this.f31672b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31674e = false;
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null) {
            mi0Var.stop();
        }
        ni0 ni0Var = this.f31673c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
        }
    }

    public void setAnimation(mi0 mi0Var) {
        if (this.f31672b == mi0Var) {
            return;
        }
        ni0 ni0Var = this.f31673c;
        if (ni0Var != null) {
            ni0Var.onDetachedFromWindow();
            this.f31673c = null;
        }
        this.f31672b = mi0Var;
        mi0Var.f30863r0 = this;
        if (this.d) {
            mi0Var.I(1);
        }
        HashMap hashMap = this.f31671a;
        if (hashMap != null) {
            this.f31672b.W = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                mi0 mi0Var2 = this.f31672b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                mi0Var2.f30864s.put((String) entry.getKey(), num);
                mi0Var2.E();
            }
            this.f31672b.m();
        }
        this.f31672b.H(true);
        setImageDrawable(this.f31672b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i9) {
        super.setImageResource(i9);
        this.f31672b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ni0 ni0Var = this.f31673c;
        if (ni0Var != null) {
            ni0Var.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null) {
            mi0Var.f30861q0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f31676n = z10;
    }

    public void setProgress(float f10) {
        mi0 mi0Var = this.f31672b;
        if (mi0Var != null) {
            mi0Var.Q(f10, true);
        }
    }

    public void c() {
    }
}
