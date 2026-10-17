package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.uj0;
public final class v7 {
    public int[] A;
    public int[] B;
    public boolean C;
    public boolean D;
    public int E;
    public Path F;
    public Bitmap G;
    public int H;
    public long I;
    public long J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final String f34993a;
    public float f34994a0;
    public TL_wallet.nftItem f34995b;
    public float f34996b0;
    public final ci.g3 f34997c;
    public float f34998c0;
    public final ImageReceiver d;
    public final w7 f34999d0;
    public final u7 e;
    public final u7 f35000f;
    public final u7 f35001g;
    public final u7 h;
    public final u7 f35002i;
    public final u7 f35003j;
    public final u7 f35004k;
    public final u7 f35005l;
    public final u7 f35006m;
    public final u7 f35007n;
    public final u7 f35008o;
    public final u7 f35009p;
    public final u7 f35010q;
    public final u7 f35011r;
    public final u7[] f35012s;
    public final TL_stars.starGiftAttributeBackdrop f35013t;
    public Bitmap f35014u;
    public Bitmap v;
    public Bitmap f35015w;
    public Canvas f35016x;
    public int[] f35017y;
    public int[] f35018z;

    public v7(w7 w7Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.n2 n2Var = w7Var.f35042a;
        this.f34999d0 = w7Var;
        this.f34997c = new ci.g3(this, w7Var, 6);
        this.d = new ImageReceiver(w7Var.M);
        u7 u7Var = new u7(0.0f, 900.0f, 0.86f);
        this.e = u7Var;
        u7 u7Var2 = new u7(0.0f, 900.0f, 0.86f);
        this.f35000f = u7Var2;
        u7 u7Var3 = new u7(1.0f, 420.0f, 0.78f);
        this.f35001g = u7Var3;
        u7 u7Var4 = new u7(1.0f, 700.0f, 0.9f);
        this.h = u7Var4;
        u7 u7Var5 = new u7(0.0f, 700.0f, 0.9f);
        this.f35002i = u7Var5;
        u7 u7Var6 = new u7(0.0f, 380.0f, 0.82f);
        this.f35003j = u7Var6;
        u7 u7Var7 = new u7(0.0f, 30.0f, 1.0f);
        this.f35004k = u7Var7;
        u7 u7Var8 = new u7(0.0f, 520.0f, 0.62f);
        this.f35005l = u7Var8;
        u7 u7Var9 = new u7(0.0f, 300.0f, 1.0f);
        this.f35006m = u7Var9;
        u7 u7Var10 = new u7(0.0f, 150.0f, 0.82f);
        this.f35007n = u7Var10;
        u7 u7Var11 = new u7(0.0f, 150.0f, 0.82f);
        this.f35008o = u7Var11;
        u7 u7Var12 = new u7(0.0f, 240.0f, 1.0f);
        this.f35009p = u7Var12;
        u7 u7Var13 = new u7(0.0f, 700.0f, 1.0f);
        this.f35010q = u7Var13;
        u7 u7Var14 = new u7(1.0f, 260.0f, 1.0f);
        this.f35011r = u7Var14;
        this.f35012s = new u7[]{u7Var, u7Var2, u7Var3, u7Var4, u7Var5, u7Var6, u7Var7, u7Var8, u7Var9, u7Var10, u7Var11, u7Var12, u7Var13, u7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f34998c0 = 1.0f;
        this.f34995b = nftitem;
        this.f34993a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f35013t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.setImage(ImageLocation.getForDocument(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        o2 o2Var = new o2(this, 5);
        this.f34997c.setDelegate(o2Var);
        this.d.setDelegate(o2Var);
        this.f34997c.setCurrentAccount(n2Var.getCurrentAccount());
        this.d.setCurrentAccount(n2Var.getCurrentAccount());
        this.f34997c.setAllowStartLottieAnimation(false);
        this.f34997c.setAutoRepeat(1);
        this.f34997c.setImage(ImageLocation.getForDocument(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (w7Var.isAttachedToWindow()) {
            this.f34997c.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
    }

    public final Bitmap a() {
        int i10;
        w7 w7Var = this.f34999d0;
        RectF rectF = w7Var.E;
        ci.g3 g3Var = this.f34997c;
        Bitmap bitmap = g3Var.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            uj0 lottieAnimation = g3Var.getLottieAnimation();
            if (lottieAnimation == null) {
                i10 = 0;
            } else {
                i10 = lottieAnimation.f31001a0;
            }
            Bitmap bitmap2 = this.v;
            if (bitmap2 != null && this.G == bitmap && this.E == i10) {
                return this.f35014u;
            }
            this.G = bitmap;
            this.E = i10;
            if (bitmap2 == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f35016x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f35016x.drawBitmap(bitmap, (Rect) null, rectF, w7Var.f35097y);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f35014u;
        }
        return this.f35014u;
    }

    public final boolean b() {
        int i10 = this.H;
        if (i10 == 2 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void c() {
        boolean z10;
        if (this.f35017y == null) {
            this.f35017y = new int[82944];
            this.f35018z = new int[82944];
            this.A = new int[82944];
            this.B = new int[945];
        }
        this.v.getPixels(this.f35017y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f35015w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f35017y;
        int[] iArr2 = this.f35018z;
        int[] iArr3 = this.A;
        int[] iArr4 = this.B;
        if (w7.k6.f48749a == null) {
            w7.k6.f48749a = new DispatchQueue("walletStickerOutline");
        }
        w7.k6.f48749a.postRunnable(new i2.d1(this, iArr, iArr2, iArr3, iArr4, z10, 12));
    }
}
